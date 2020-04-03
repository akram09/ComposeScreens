package com.kero.compose.screens.screens

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.ui.graphics.ImageAsset
import androidx.ui.graphics.imageFromResource
import androidx.ui.res.imageResource
import com.kero.jetpack.compose.playground.R

data class Place(val name:String, val location:String, val priceForNight:Double,
                 val image :ImageAsset )

fun  getPlaces(resources:Resources) = listOf(
    Place("Tincidunt Pool" , "Madrid, Spain", 200.0 , imageFromResource(res=resources , resId = R.drawable.place5)),
    Place("Curabitur Beach" , "Rome, Italy", 100.0 , imageFromResource(res =resources,resId = R.drawable.place4)),
    Place("Hotel Dolah Amet & Suites" , "London, England", 100.0 , imageFromResource(res =resources,resId = R.drawable.place1)),
    //Place("Beach Mauris Blandit" , "Lisbon, Portugal", 100.0 , imageFromResource(res =resources,resId = R.drawable.place2)),
    Place("Ipsum Restaurant" , "Paris, France", 200.0 , imageFromResource(res =resources,resId = R.drawable.place3))

)

