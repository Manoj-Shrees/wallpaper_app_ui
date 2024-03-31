package com.dreamer.wallpaper_app_11.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dreamer.wallpaper_app_11.R
import com.dreamer.wallpaper_app_11.presentation.ViewModel.FilterDialogViewModel
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.CategorySelectionList
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.FilterDialog
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.NormalTextComponent
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.SearchBarwidget
import com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage.WallpaperList


@Composable
fun HomePage(navController: NavController, ViewModel: FilterDialogViewModel){

    Surface(
        color = colorResource(id = R.color.bgcolor),
        modifier = Modifier
            .fillMaxSize()
    )

    {

        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .padding(10.dp)
            ) {

                Spacer(modifier = Modifier.height(100.dp))



                Row(modifier = Modifier
                    .height(100.dp)
                    .padding(0.dp, 20.dp, 0.dp, 10.dp)) {

                    Image(
                        painter = painterResource(id = R.drawable.profilepic),
                        contentDescription = "profilepic",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = "Welcome,",
                            color = Color.White,
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                            )
                        )
                        NormalTextComponent(value = "Roronova Zoro")

                    }

                    Spacer(modifier = Modifier.width(10.dp))


                }

                IconButton(modifier = Modifier.then(
                    Modifier
                        .size(60.dp)
                        .padding(start = 2.dp, top = 20.dp)
                        .align(Alignment.TopEnd)
                ),
                    onClick = {
                        navController.navigate("moreoption") {
                            popUpTo("moreoption")
                        }

                    }) {
                    Icon(
                        painter = painterResource(id = R.drawable.fav_btn),
                        "contentDescription",
                        tint = Color.White
                    )
                }


            }


            SearchBarwidget(ViewModel)


            CategorySelectionList(modifier = Modifier.height(120.dp), navController)

            WallpaperList(navController)


            

        }


    }

    if (ViewModel.isDailogShow){
        FilterDialog(
            onDismiss = {
                ViewModel.onDismissDialog()
            },
            OnConfirm = {

            }

        )
    }
}

