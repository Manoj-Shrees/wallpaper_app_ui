package com.dreamer.wallpaper_app_11.ui.theme.componnets.WallpaperByCategory

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarWallpaperByCatWidget(){

    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }

    val searchHistory = listOf("Naruto", "One piece","Batman","spiderman","Goku","Luffy")

    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center,) {

        DockedSearchBar(
            query = query,
            onQueryChange = {query = it},
            onSearch = { newQuery->
                println("Searched successfull: $newQuery")
            },
            active = active,
            onActiveChange = {active = it},
            placeholder = {
                Text(text = "Search")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            },
            trailingIcon = {

                    if (active) {

                        IconButton(onClick = {
                            if (query.isNotEmpty()) query = "" else active = false
                        }) {
                            Icon(imageVector = Icons.Filled.Close, contentDescription = "Close")
                        }
                    }

                }


        ) {
            searchHistory.takeLast(4).forEach{item ->
                ListItem(
                    modifier = Modifier.clickable{ query = item},
                    headlineContent = { Text(text = item) },
                    leadingContent = {
                        Icon(imageVector = Icons.Filled.Face, contentDescription = "history")
                    }
                )

            }


        }

    }

}