package com.dreamer.wallpaper_app_11.presentation.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class FilterDialogViewModel: ViewModel(){

    var isDailogShow by mutableStateOf(false)
        private set

    fun onFilterClick()
    {
        isDailogShow = true
    }

    fun onDismissDialog(){
        isDailogShow = false
    }


}