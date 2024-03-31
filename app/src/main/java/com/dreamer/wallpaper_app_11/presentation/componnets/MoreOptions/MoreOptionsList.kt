package com.dreamer.wallpaper_app_11.ui.theme.componnets.MoreOptions

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamer.wallpaper_app_11.models.moreoptionlist
import com.dreamer.wallpaper_app_11.R

@Composable
fun MoreOptionsList()
{
    val optionList = listOf(
        "HOME",
        "PROFILE",
        "ABOUT US",
        "SUBSCRIPTION",
        "LEGAL",

        )

    val optionImgLists = listOf(
        R.drawable.home,
        R.drawable.profile,
        R.drawable.aboutus,
        R.drawable.crown,
        R.drawable.term,
    )


    val items =(0..4).map {
        moreoptionlist(
            optionList[it],
            optionImgLists[it]
        )
    }


    LazyColumn(modifier = Modifier .fillMaxWidth()
        .fillMaxHeight()){
        itemsIndexed(items){ index, item ->
            Listitems(modifier = Modifier, item = item)
        }
    }


}


@Composable
fun Listitems(modifier: Modifier, item: moreoptionlist) {

    Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .clickable (onClick = { /* ...*/ })
            ,
            horizontalArrangement = Arrangement.Absolute.Left,
        ) {
            Spacer(modifier = Modifier.width(20.dp))

            Icon(
                painter = painterResource(id = item.img),
                "contentDescription",
                tint = Color.White,
                modifier = Modifier
                    .size(50.dp)
                    .padding(10.dp)

            )

            Spacer(modifier = Modifier.width(40.dp))

            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = item.name,
                color = Color.White,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Light,
                )
            )

        }





}