package com.dreamer.wallpaper_app_11.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.dreamer.wallpaper_app_11.R
import com.dreamer.wallpaper_app_11.screens.HomePage


@Composable
fun Wallpaper_app(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = colorResource(id = R.color.bgcolor),
    ){
        HomePage()
    }
}