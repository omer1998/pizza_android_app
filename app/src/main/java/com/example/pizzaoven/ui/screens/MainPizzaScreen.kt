package com.example.pizzaoven.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaoven.R

val additiveList = listOf<String>()
val breadsTypesList = listOf(
    R.drawable.bread_1,
    R.drawable.bread_2,
    R.drawable.bread_3,
    R.drawable.bread_4,
    R.drawable.bread_5,
)

@Composable
fun MainPizzaScreen(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { breadsTypesList.size })
    Column(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // AppBar

        Spacer(Modifier.height(50.dp))
        // plate
        Box(
            modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.fillMaxWidth(0.75f),
                painter = painterResource(R.drawable.plate),
                contentDescription = "plate image",
                contentScale = ContentScale.Fit
            )
            HorizontalPager(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                state = pagerState,
                key = { breadsTypesList[it] }) { index ->
                Box(
                    modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(breadsTypesList[index]),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxWidth(0.65f)
                    )
                }
            }
        }

        Spacer(Modifier.height(25.dp))

        // price
        Text("$17", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(25.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(
                onClick = {},
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White, contentColor = Color.Black
                ),
                modifier = Modifier.size(70.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp)
                // ==> this will change according to state
            ) {
                Text("S", fontSize = 25.sp)
            }

            Spacer(Modifier.width(20.dp))

            Button(
                onClick = {},
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White, contentColor = Color.Black
                ),
                modifier = Modifier.size(70.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp)
                // ==> this will change according to state
            ) {
                Text("M", fontSize = 25.sp)
            }
            Spacer(Modifier.width(20.dp))
            Button(
                onClick = {},
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White, contentColor = Color.Black
                ),
                modifier = Modifier.size(70.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp)

            ) {
                Text("L", fontSize = 25.sp)
            }


        }
        Spacer(Modifier.height(30.dp))

        Text(
            "Customize Your Pizza".uppercase(),
            color = Color.Gray,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
        )
        Spacer(Modifier.height(30.dp))

        LazyRow(
            modifier= Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
                        .size(70.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.basil_8),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
                        .size(70.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.onion_3),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.padding(10.dp)


                    )
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .background(color =Color.White, shape = CircleShape)
                        .size(70.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.broccoli_7),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.padding(10.dp)

                    )
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
                        .size(70.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.mushroom_10),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.padding(10.dp)

                    )
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .background(color = Color.White, shape = CircleShape)
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
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            contentPadding = PaddingValues(10.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Add To Cart", color = Color.LightGray, fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMainPizzaScreen() {
    MainPizzaScreen()
}