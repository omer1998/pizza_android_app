package com.example.pizzaoven.ui.viewmodel

import com.example.pizzaoven.R

data class PizzaUiState(
    val index :Int = 0,
    val breadType: BreadType = BreadType.Bread1,
    val size : PizzaSize = PizzaSize.S,
    val ingredients: List<IngredientType> = emptyList()
)

fun PizzaUiState.getBreadResource(): Int{
    return when(breadType){
        BreadType.Bread1 -> R.drawable.bread_1
        BreadType.Bread2 -> R.drawable.bread_2
        BreadType.Bread3 -> R.drawable.bread_3
        BreadType.Bread4 -> R.drawable.bread_4
        BreadType.Bread5 -> R.drawable.bread_5
    }
}
