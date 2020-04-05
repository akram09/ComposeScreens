package com.kero.compose.screens.screens

import android.util.Log
import androidx.compose.Composable
import androidx.core.graphics.ColorUtils
import androidx.ui.core.ConfigurationAmbient
import androidx.ui.foundation.isSystemInDarkTheme
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.MaterialTheme.typography
import androidx.ui.material.Typography
import androidx.ui.material.darkColorPalette
import androidx.ui.material.lightColorPalette
import androidx.ui.text.font.*
import com.kero.jetpack.compose.playground.R

@Composable
fun AppTheme(children :@Composable() ()->Unit){
    val themesColor = if (isSystemInDarkTheme()){
        Log.e("errr", "System is in dark theme")
        darkColorPalette(primary = Color.DarkGray ,
            onPrimary = Color(0xFF7F949F),
            secondary = Color(0xFFC20029))
    }else{
        Log.e("errr", "System is in Light Theme")
        lightColorPalette(primary = Color
            .White ,
            onPrimary = Color(0xFF7F949F),
            secondary = Color(0xFFC20029))
    }
    //val themeTypography = Typography(
    //        h1  = defaultTypography.h1.copy(fontFamily = appFonts),
    //        h2 =defaultTypography.h2.copy(fontFamily = appFonts),
    //        h3 = defaultTypography.h3.copy(fontFamily = appFonts),
    //        h4 = defaultTypography.h4.copy(fontFamily = appFonts),
    //        h5=defaultTypography.h5.copy(fontFamily = appFonts),
    //        h6 = defaultTypography.h6.copy(fontFamily = appFonts),
    //        subtitle1 = defaultTypography.subtitle1.copy(fontFamily = appFonts),
    //        subtitle2 = defaultTypography.subtitle2.copy(fontFamily = appFonts),
    //        body1 = defaultTypography.body1.copy(fontFamily = appFonts),
    //        body2 = defaultTypography.body2.copy(fontFamily = appFonts)
    //    )
    //val appFonts = fontFamily(
    //        ResourceFont(R.font.robotocondensedbold , FontWeight.Bold),
    //        ResourceFont(R.font.robotocondensedregular ),
    //        ResourceFont(R.font.robotocondensedlight , FontWeight.W400)
    //    )

    val defaultTypography  = Typography()

    MaterialTheme(colors = themesColor  ) {
        children()
    }
}