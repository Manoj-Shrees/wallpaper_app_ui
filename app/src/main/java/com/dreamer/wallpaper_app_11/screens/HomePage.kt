package com.dreamer.wallpaper_app_11.screens

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dreamer.wallpaper_app_11.R
import com.dreamer.wallpaper_app_11.componnets.NormalTextComponent
import com.dreamer.wallpaper_app_11.componnets.SearchBarwidget


@Composable
fun HomePage(){

    Surface(
        color = colorResource(id = R.color.bgcolor),
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
    )

    {

        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier.height(100.dp)
            ) {

                Spacer(modifier = Modifier.height(100.dp))



                Row {

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
                        NormalTextComponent(value = "Vikas")

                    }

                    Spacer(modifier = Modifier.width(10.dp))


                }

                IconButton(modifier = Modifier.then(
                    Modifier.size(50.dp)
                        .padding(start = 2.dp, top = 8.dp)
                        .align(Alignment.TopEnd)
                ),
                    onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.fav_btn),
                        "contentDescription",
                        tint = Color.White
                    )
                }


            }


            SearchBarwidget()

        }


    }
}



@Preview
@Composable
fun DefaultPreviewHomePage()
{
    HomePage()
}