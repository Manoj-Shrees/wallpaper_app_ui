package com.dreamer.wallpaper_app_11.ui.theme.componnets.WallpaperCategory

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
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
fun CategoryList(navController: NavController) {


    val categoryLists = listOf(
        "Anime",
        "Art",
        "Abstract",
        "Cars",
        "Celebrity",
        "Dynamic Island",
        "Game",
        "Horror",
        "Love",
        "Nature",
        "Sci-fi",
        "Movies",

    )

    val catImgLists = listOf(
        R.drawable.cat1img,
        R.drawable.cat2img,
        R.drawable.cat3img,
        R.drawable.cat4img,
        R.drawable.cat5img,
        R.drawable.cat6img,
        R.drawable.cat7img,
        R.drawable.cat8img,
        R.drawable.cat9img,
        R.drawable.cat10img,
        R.drawable.cat6img,
        R.drawable.cat1img,
    )


    val items =(0..11).map {
        categorylist(
            categoryLists[it],
            catImgLists[it]
        )

    }


    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
        contentPadding = PaddingValues(30.dp),
        verticalItemSpacing =  30.dp,
        horizontalArrangement = Arrangement.spacedBy(30.dp),
    )
    {
        items(items){ item ->
            Listitems(
                modifier = Modifier,
                item = item
            )
        }
    }

}


@Composable
fun Listitems(modifier: Modifier, item: categorylist){
    Card(
        modifier
            .padding(5.dp)
            .aspectRatio(1.5f)
        ,
        colors = CardDefaults.cardColors(
            containerColor = Color(0XFF3D385C)
        ),

        elevation = CardDefaults.cardElevation(10.dp)

    ) {



        Box(
            modifier
                .fillMaxSize()
                .width(200.dp)
                .offset(y = (25).dp)
            , contentAlignment = Alignment.Center
        )
        {


            Text(text = item.name, modifier = Modifier
                .padding(all = 5.dp), fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)


        }

    }


    Box(modifier = modifier
        .width(100.dp)
        .height(80.dp)
        .offset(y = (-30).dp))
        {
            Image(
                painter = painterResource(id = item.img),
                contentDescription = "catimg",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            )

        }
}