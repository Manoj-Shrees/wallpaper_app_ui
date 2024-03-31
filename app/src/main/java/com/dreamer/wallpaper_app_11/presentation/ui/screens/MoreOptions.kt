package com.dreamer.wallpaper_app_11.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dreamer.wallpaper_app_11.R
import com.dreamer.wallpaper_app_11.ui.theme.componnets.MoreOptions.MoreOptionsList

@Composable
fun MoreOptions(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    )
    {

        val gradientcolorlist = listOf(
            Color(0xFF333089),
            Color(0xFF724AA5),
            Color(0xFFCC89C7),
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = gradientBG(
                        colors = gradientcolorlist
                    )
                )
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(10.dp,20.dp,20.dp,10.dp)
            ) {


                Box(
                    modifier = Modifier
                        .size(220.dp)
                        .align(Alignment.TopEnd)
                )
                {


                    Image(
                        painter = painterResource(id = R.drawable.profilepic),
                        contentDescription = "profilepic",
                        modifier = Modifier
                            .size(60.dp)
                            .align(Alignment.TopEnd)
                            .clip(CircleShape),

                        )



                    Column(
                        Modifier.padding(10.dp)
                    ) {
                        Text(
                            text = "Roronova Zoro",
                            color = Color.White,
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 21.sp,
                                fontWeight = FontWeight.ExtraBold,
                            )
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {

                            Image(
                                painter = painterResource(id = R.drawable.crown),
                                contentDescription = "profilepic",
                                modifier = Modifier
                                    .size(40.dp)
                                    .padding(0.dp, 5.dp, 5.dp, 10.dp)
                                    .clip(CircleShape),

                                )

                            Text(
                                text = "premium",
                                color = Color.White,
                                style = androidx.compose.ui.text.TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Light,
                                )
                            )

                        }


                    }

                }

                Box(
                    modifier = Modifier
                        .height(100.dp)
                        .align(Alignment.TopStart)
                )
                {
                    IconButton(modifier = Modifier.then(
                        Modifier
                            .width(70.dp)
                            .height(70.dp)
                            .align(Alignment.TopStart)
                    ),
                        onClick = {

                            navController.navigate("home") {
                                popUpTo("home")

                            }

                        }) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                               ,
                            horizontalArrangement = Arrangement.Start,
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.back_arrow),
                                "contentDescription",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(50.dp)
                            )
                        }
                    }

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp)
            ) {


                MoreOptionsList()

                Text(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(10.dp)
                    ,
                    text = "App Version - 1.0",
                    color = Color.White,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Light,
                    )
                )

                Row(modifier = Modifier
                    .align(Alignment.BottomStart)){

                    IconButton(modifier = Modifier.then(
                        Modifier
                            .width(50.dp)
                            .height(50.dp)

                    ),
                        onClick = {

                            navController.navigate("home") {
                                popUpTo("home")

                            }

                        }) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                            ,
                            horizontalArrangement = Arrangement.Center,
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.logout),
                                "contentDescription",
                                tint = Color.White,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(10.dp)
                            )
                        }
                    }


                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),

                        text = "LogOut",
                        color = Color.White,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Light,
                        )
                    )
                }


            }


        }
    }
}


@Composable
private fun gradientBG(
    colors: List<Color>): Brush {
   return Brush.linearGradient(
       colors = colors,
       start = Offset.Zero,
       end = Offset(0f, Float.POSITIVE_INFINITY)
   )
}


@Preview(showBackground = true)
@Composable
fun ContentPreview(){
    MoreOptions(rememberNavController())
}