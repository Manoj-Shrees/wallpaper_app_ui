package com.dreamer.wallpaper_app_11.Model

import com.dreamer.wallpaper_app_11.Model.WallpaperCategory.ANIME
import com.dreamer.wallpaper_app_11.Model.WallpaperCategory.NATURE

enum class WallpaperCategory(val value: String) {

    ANIME("Anime"),
    NATURE("nature"),


}

fun getAllWallpaperCategory(): List<WallpaperCategory>{
    return  listOf(ANIME,NATURE)
}

fun getWallpaperCategory(value: String): WallpaperCategory?{
    val map = WallpaperCategory.values().associateBy ( WallpaperCategory::value )

    return map[value]
}