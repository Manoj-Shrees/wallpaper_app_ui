package com.dreamer.wallpaper_app_11.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dreamer.wallpaper_app_11.R
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.WallpaperList
import com.dreamer.wallpaper_app_11.ui.theme.componnets.WallpaperByCategory.SearchBarWallpaperByCatWidget


@Composable
fun WallpaperByCategory(navController: NavController){

    Surface(
        color = colorResource(id = R.color.bgcolor),
        modifier = Modifier
            .fillMaxSize()
    )

    {

        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
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
                            .padding(8.dp)
                        ,
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


                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Anime",
                    color = Color.White,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )


            }


            SearchBarWallpaperByCatWidget()


            WallpaperList(navController)




        }


    }

}

