package com.dreamer.wallpaper_app_11.app.Navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dreamer.wallpaper_app_11.screens.HomePage
import com.dreamer.wallpaper_app_11.screens.SetWallpaper

@Composable
fun Nav(){

    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = "home")
    {
       composable(route ="home",
           enterTransition = {
               slideIntoContainer(
                   towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                   animationSpec = tween(700)
               )
           },
           exitTransition = {
               slideOutOfContainer(
                   towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                   animationSpec = tween(700)
               )
           },
           popEnterTransition = {
               slideIntoContainer(
                   towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                   animationSpec = tween(700)
               )
           },
           popExitTransition = {
               slideOutOfContainer(
                   towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                   animationSpec = tween(700)
               )
           }
           ){

           HomePage(navController)
       }

        composable(route ="selectwallpaper"){
            SetWallpaper(navController)
        }



    }


}