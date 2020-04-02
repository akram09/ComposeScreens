package com.kero.compose.screens.screens

import androidx.annotation.DrawableRes

data class Place(val name:String ,val localisation:String , val priceForNight:Double ,
                 @DrawableRes val imageDrawable:Int )
val places = listOf<Place>(

)