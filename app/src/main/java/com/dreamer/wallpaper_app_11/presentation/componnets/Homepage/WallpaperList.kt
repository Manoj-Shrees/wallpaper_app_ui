package com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage

import android.content.Intent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dreamer.wallpaper_app_11.R
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WallpaperList(navController: NavController)
{

    val catImgLists = listOf(
        R.drawable.catnature,
        R.drawable.catcars,
        R.drawable.avatar,
        R.drawable.testimage,
        R.drawable.deadpool,
        R.drawable.spiderman,
        R.drawable.homesmovie,
        R.drawable.mario,
        R.drawable.catnaruto,
        R.drawable.hacker,
        R.drawable.joker,
        R.drawable.anonymous,
    )

    val items =(0..9).map {
        ListItem(
            catImgLists[it]
        )
    }


    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = Modifier.fillMaxSize().padding(10.dp,10.dp,0.dp, 10.dp),
        contentPadding = PaddingValues(10.dp),
        verticalItemSpacing =  16.dp,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        )
    {
       items(items){ item ->
           WallpapersItem(item = item,navController)
       }
    }
}


data class ListItem(
    val img: Int
)

@Composable
fun WallpapersItem(item: ListItem, navController: NavController){
    Box(
        modifier = Modifier
            .clickable(onClick = {
                navController.navigate("selectwallpaper"){
                    popUpTo("selectwallpaper")
                }
            })
        .fillMaxWidth()
        .clip(RoundedCornerShape(10.dp))

    )
    {
        Image(
            painter = painterResource(id = item.img),
            contentDescription = "profilepic",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .defaultMinSize(minHeight = 250.dp)
                .heightIn(0.dp, 350.dp)
        )
    }
}

