package com.dreamer.wallpaper_app_11.ui.theme.componnets.Homepage

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategorySelection()
{

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var category by remember {
        mutableStateOf("categories")
    }




































    
    Box(
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)
            .border(
                width = 2.dp,
                color = Color.Black.copy(alpha = 0.5f),
                shape = RoundedCornerShape(28.dp)
            )
            ,
        contentAlignment = Alignment.Center
    )
    {
        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = { isExpanded = it }) {

            TextField(
                value = category,
                onValueChange = {},
                readOnly = true,
                textStyle = LocalTextStyle.current.copy(fontSize = 20.sp),
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                ),
                modifier = Modifier.menuAnchor().fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
            ) {

                DropdownMenuItem(text = { Text(text = "Anime",  style = MaterialTheme.typography.titleMedium) },
                    onClick = {
                    category = "Anime"
                    isExpanded = false })

                DropdownMenuItem(text = { Text(text = "Nature", style = MaterialTheme.typography.titleMedium) },  onClick = {
                    category = "Nature"
                    isExpanded = false })

                DropdownMenuItem(text = { Text(text = "Sci-fi",  style = MaterialTheme.typography.titleMedium) },  onClick = {
                    category = "Sci-fi"
                    isExpanded = false })

                DropdownMenuItem(text = { Text(text = "Cars",  style = MaterialTheme.typography.titleMedium) },  onClick = {
                    category = "Cars"
                    isExpanded = false })

                DropdownMenuItem(text = { Text(text = "Movies", style = MaterialTheme.typography.titleMedium) },  onClick = {
                    category = "Movies"
                    isExpanded = false })
            }

        }
    }

}