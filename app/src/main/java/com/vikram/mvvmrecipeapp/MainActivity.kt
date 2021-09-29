package com.vikram.mvvmrecipeapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        setContent {
            /*    Column(modifier = Modifier
                   .background(color = Color.Gray)
                   .fillMaxWidth()
                   .height(200.dp)
                   .border(width = 1.dp, color = Color.White),
               verticalArrangement = Arrangement.Center) {
   Text(text = "Item1",
   modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
               }*/

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(color = Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(250.dp)

                )

                Column(modifier = Modifier.padding(16.dp)) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy Meal", style = TextStyle(
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        )

                        Text(
                            text = "$5.99", style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Green
                            ), modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    Text(
                        text = "800 Calories", style = TextStyle(
                            fontSize = 18.sp,
                            color = Color.Blue
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 8.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Order Now")
                    }


                }


            }

        }
    }
}