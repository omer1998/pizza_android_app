package com.example.pizzaoven.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pizzaoven.R
import kotlin.random.Random

@Composable
fun IngredientLayer(
    ingredientRes: List<Int>,
    modifier: Modifier = Modifier,

) {
    val random = remember { Random(System.currentTimeMillis()) }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {


        ingredientRes.forEach {
            val xOffset = random.nextInt(-75, 75).dp
            val yOffset = random.nextInt(-75, 75).dp

            Image(
                painter = painterResource(it),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .offset(x = xOffset, y = yOffset),
                contentScale = ContentScale.Fit
            )
        }
    }
}