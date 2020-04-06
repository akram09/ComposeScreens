package com.kero.compose.screens.screens

import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.MutableState

sealed class Screen{
    object  DashboardScreen:Screen()
    data class PlaceDetailScreen(val place:Place):Screen()
}
@Model
object AppStatus{
    var currentScreen:Screen = Screen.DashboardScreen
}
fun navigateTo(screen: Screen){
    AppStatus.currentScreen = screen
}
