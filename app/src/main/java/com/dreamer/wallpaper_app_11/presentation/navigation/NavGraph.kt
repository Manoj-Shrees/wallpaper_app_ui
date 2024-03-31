package com.dreamer.wallpaper_app_11.presentation.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dreamer.wallpaper_app_11.presentation.ViewModel.FilterDialogViewModel
import com.dreamer.wallpaper_app_11.ui.theme.screens.HomePage
import com.dreamer.wallpaper_app_11.ui.theme.screens.MoreOptions
import com.dreamer.wallpaper_app_11.ui.theme.screens.SetWallpaper
import com.dreamer.wallpaper_app_11.ui.theme.screens.WallpaperByCategory
import com.dreamer.wallpaper_app_11.ui.theme.screens.WallpaperCategory

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

           HomePage(navController, FilterDialogViewModel())
       }

        composable(route ="selectwallpaper",

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
            }){
            SetWallpaper(navController)
        }


        composable(route ="wallpapercat",
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
            },

            ){
            WallpaperCategory(navController)
        }

        composable(route ="wallpaperbycat",
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
            },
            ){
            WallpaperByCategory(navController)
        }

        composable(route ="moreoption",
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
            },

        ){
            MoreOptions(navController)
        }


    }




}