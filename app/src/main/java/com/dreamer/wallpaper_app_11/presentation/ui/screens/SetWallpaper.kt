package com.dreamer.wallpaper_app_11.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dreamer.wallpaper_app_11.R

@Composable
fun SetWallpaper(navController: NavController){

    Surface(
        color = colorResource(id = R.color.white),
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Box(){

            Image(
                painter = painterResource(id = R.drawable.spiderman),
                contentDescription = "profilepic",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )

            IconButton(modifier = Modifier.then(
                Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .align(Alignment.TopStart)
            ),
                onClick = {

                    navController.navigate("home"){
                        popUpTo("home")

                }

                }) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(8.dp)
                        .background(Color(0x3B000000)),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.back_arrow),
                        "contentDescription",
                        tint = Color.White,
                        modifier = Modifier
                            .fillMaxSize().padding(5.dp)
                    )
                }
            }



            IconButton(modifier = Modifier.then(
                Modifier
                    .width(200.dp)
                    .height(80.dp)
                    .align(Alignment.BottomStart)
            ),
                onClick = { }) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(10.dp)
                        .background(Color(0x3B000000)),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.paintroller),
                        "contentDescription",
                        tint = Color.White,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp)
                            .fillMaxSize()
                    )

                    Text("Set as",
                        color = Color.White,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Normal,
                        ),
                        modifier = Modifier.align(alignment = Alignment.CenterVertically),
                        textAlign = TextAlign.Center
                    )
                }

            }


            IconButton(modifier = Modifier.then(
                Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .align(Alignment.BottomEnd)
            ),
                onClick = { }) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(10.dp)
                        .background(Color(0x3B000000)),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.like_btn),
                        "contentDescription",
                        tint = Color.Red,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp)


                    )
                }
            }



        }




    }

}