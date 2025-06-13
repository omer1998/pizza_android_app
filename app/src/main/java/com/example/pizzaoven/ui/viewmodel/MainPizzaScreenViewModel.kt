package com.example.pizzaoven.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainPizzaScreenViewModel: ViewModel(){
    private val _pizzaScreenState: MutableState<PizzaScreenUiState> = mutableStateOf(PizzaScreenUiState() )
    val state: State<PizzaScreenUiState> = _pizzaScreenState

    init {
        val initialPizzas = BreadType.entries.mapIndexed {index , bread ->
            PizzaUiState(breadType = bread, index = index)
        }
        _pizzaScreenState.value = PizzaScreenUiState(
            pizzasUiState = initialPizzas
        )
        println("pizza screen state: ${_pizzaScreenState.value}")
    }

    fun changeSize( newSize: PizzaSize){
        val index=  _pizzaScreenState.value.selectedPizzaIndex
        var availablePizzas = _pizzaScreenState.value.pizzasUiState.toMutableList()
        val currentPizzaState = availablePizzas[index]
        availablePizzas[index] = currentPizzaState.copy(size = newSize)
        _pizzaScreenState.value= _pizzaScreenState.value.copy(
            pizzasUiState = availablePizzas
        )
    }
    fun toggleIngredient(ingredientType: IngredientType){
        val index=  _pizzaScreenState.value.selectedPizzaIndex
        var availablePizzas = _pizzaScreenState.value.pizzasUiState.toMutableList()
        val currentPizzaState = availablePizzas[index]
        var currentIngredients = currentPizzaState.ingredients.toMutableList()

        if(ingredientType in  currentIngredients){
            currentIngredients.removeIf { it == ingredientType }
        }else{
           currentIngredients.add(ingredientType)
        }
        availablePizzas[index] = currentPizzaState.copy(ingredients = currentIngredients)
        _pizzaScreenState.value= _pizzaScreenState.value.copy(
            pizzasUiState = availablePizzas
        )

    }
    fun updateSelectedPizzaIndex(newIndex:Int){
        _pizzaScreenState.value = _pizzaScreenState.value.copy(selectedPizzaIndex = newIndex)
    }

    fun getCurrentSelectedPizzaState(): PizzaUiState{
        return _pizzaScreenState.value.pizzasUiState[_pizzaScreenState.value.selectedPizzaIndex]
    }

}