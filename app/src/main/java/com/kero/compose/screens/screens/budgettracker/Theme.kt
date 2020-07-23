package com.kero.compose.screens.screens.budgettracker

import androidx.compose.Composable
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Typography
import androidx.ui.material.lightColorPalette
import androidx.ui.text.Typeface
import androidx.ui.text.font.Font
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.font
import androidx.ui.text.font.fontFamily
import com.kero.compose.screens.R

@Composable
fun AppTheme(children: @Composable()()-> Unit){
    val fontFamily = fontFamily(fonts = listOf(font(R.font.gt_walshein)))

    val defaultTypography = Typography()
    val themeTypography = Typography(
        h1 = defaultTypography.h1.copy(fontFamily = fontFamily),
        h2 = defaultTypography.h2.copy(fontFamily = fontFamily),
        h3 = defaultTypography.h3.copy(fontFamily = fontFamily),
        h4 = defaultTypography.h4.copy(fontFamily = fontFamily),
        h5 = defaultTypography.h5.copy(fontFamily = fontFamily),
        h6 = defaultTypography.h6.copy(fontFamily = fontFamily),
        subtitle1 = defaultTypography.subtitle1.copy(fontFamily = fontFamily),
        subtitle2 = defaultTypography.subtitle2.copy(fontFamily = fontFamily)
    )
    val colors = lightColorPalette(
        primary = Color(0xFF3378),
        secondary = Color(0x33C9FF)
    )
    MaterialTheme(colors = colors , typography = themeTypography) {
        children()
    }
}