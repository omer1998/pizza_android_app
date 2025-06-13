package com.example.pizzaoven.ui.viewmodel

import androidx.annotation.Size

data class PizzaScreenUiState(
    val selectedPizzaIndex: Int = 0,
    val pizzasUiState: List<PizzaUiState> = emptyList()
)
