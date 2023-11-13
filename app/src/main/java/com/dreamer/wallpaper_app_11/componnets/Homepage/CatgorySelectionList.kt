package com.dreamer.wallpaper_app_11.componnets.Homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamer.wallpaper_app_11.Model.categorylist
import com.dreamer.wallpaper_app_11.R


@Composable
fun CategorySelectionList(modifier: Modifier){

    val categoryLists = listOf(
        "Anime",
        "Nature",
        "Sci-fi",
        "Cars",
        "Movies"
    )

    val catImgLists = listOf(
        R.drawable.catnaruto,
        R.drawable.catnature,
        R.drawable.catscifi,
        R.drawable.catcars,
        R.drawable.catmovies,
        )


    val items =(0..4).map {
        categorylist(
            categoryLists[it],
            catImgLists[it]
        )

    }

    Column(
        modifier
            .fillMaxSize()
            .height(50.dp)
            .padding(0.dp, 20.dp, 0.dp, 0.dp)) {
        LazyRow(){

            items(items){ item ->
                Listitems(modifier = modifier, item = item)

            }
        }
    }
}

@Composable
fun Listitems(modifier: Modifier, item: categorylist){
    Card(
        modifier
            .padding(5.dp)
            .fillMaxWidth()
            .height(80.dp)
            .aspectRatio(1.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),

        elevation = CardDefaults.cardElevation(10.dp)

    ) {



        Box(
            modifier
                .fillMaxSize()
                .width(200.dp)
            , contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = item.img),
                contentDescription = "profilepic",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .fillMaxHeight()
            )

            Text(text = item.name, modifier = Modifier
                .background( Color(0x4F000000))
                .padding(all = 5.dp), fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)


        }

    }
}