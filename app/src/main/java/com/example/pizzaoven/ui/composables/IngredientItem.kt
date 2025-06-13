package com.example.pizzaoven.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizzaoven.R

@Composable
fun Ingredient(isSelected: Boolean,ingredientImage: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = if (isSelected)Color.LightGray else Color.White, shape = CircleShape)
            .size(70.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.sausage_2),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.padding(10.dp)

        )
    }
}