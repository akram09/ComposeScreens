package com.kero.compose.screens.screens.walletApp

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Typography
import androidx.ui.material.lightColorPalette
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.sp



val lightPalette = lightColorPalette(
    background = Color(0XFFFFFFFF),
    primary = Color(0xff375efd),
    primaryVariant = Color.Blue,
    onPrimary = Color.White,
    onSecondary = Color.White
)
val appTypography = Typography(
    h1 = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
    h2 = TextStyle(fontSize = 22.sp),
    h3 = TextStyle(fontSize = 20.sp),
    h4 = TextStyle(fontSize = 18.sp),
    h5 = TextStyle(fontSize = 16.sp),
    h6 = TextStyle(fontSize = 14.sp),
    subtitle1 = TextStyle(color = Color(0xff1d2635), fontSize = 16.sp),
    subtitle2 = TextStyle(color = Color(0xff797878), fontSize = 12.sp)
)

@Composable
fun AppTheme( content: @Composable ()->Unit){
    MaterialTheme(colors = lightPalette, typography = appTypography) {
        content()
    }
}