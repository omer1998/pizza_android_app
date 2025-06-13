package com.example.pizzaoven.ui.viewmodel

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class PizzaSize {
    S,
    M,
    L
}

fun getPizzaSizeInDp(pizzaSize: PizzaSize): Dp{
    return when(pizzaSize){
        PizzaSize.S -> 200.dp
        PizzaSize.M -> 215.dp
        PizzaSize.L -> 230.dp
    }
}