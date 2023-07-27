package com.adrian.ec3.model

import android.graphics.Color
import com.google.gson.annotations.SerializedName

data class Note(
    val name: String,
    val type: String,
    //val labels: List<String>,
    //val color: String,
    //SerializedName("created_on")
    // createOn: String
) /*{
    fun getColor(): Int = Color.parseColor(color)
}*/


