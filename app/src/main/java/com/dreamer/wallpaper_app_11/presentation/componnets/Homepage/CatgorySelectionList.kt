package com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.navigation.NavController
import com.dreamer.wallpaper_app_11.models.categorylist
import com.dreamer.wallpaper_app_11.R


@Composable
fun CategorySelectionList(modifier: Modifier, navController: NavController){

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

    Row(
        modifier
            .fillMaxSize()
            .height(50.dp)
            .horizontalScroll( rememberScrollState(0))
            .padding(0.dp, 20.dp, 0.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(modifier = Modifier.weight(0.9f)) {
            LazyRow(modifier = modifier.padding(0.dp, 0.dp, 10.dp, 0.dp).fillMaxWidth()) {

                items(items) { item ->
                    Listitems(modifier = modifier, item = item, navController)

                }

                item()
                {
                    Row(modifier
                        .fillMaxSize()
                        .height(50.dp)
                        .padding(10.dp, 0.dp, 10.dp, 0.dp) .clickable(onClick = {
                            navController.navigate("wallpapercat"){
                                popUpTo("wallpapercat")
                            }
                        })
                       ,verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "More", modifier = Modifier
                                .background(Color(0xFFCE0202), shape = RoundedCornerShape(10.dp))
                                .padding(all = 10.dp), fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }





    }
}

@Composable
fun Listitems(modifier: Modifier, item: categorylist, navController: NavController){
    Card(
        modifier
            .padding(5.dp)
            .fillMaxWidth()
            .height(80.dp)
            .aspectRatio(1.5f)
            .clickable(onClick = {
                navController.navigate("wallpaperbycat"){
                    popUpTo("wallpaperbycat")
                }
            }),
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
                .background(Color(0x4F000000))
                .padding(all = 5.dp), fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)


        }

    }
}