package com.kero.compose.screens.screens.travelapp

import androidx.compose.Model

sealed class Screen{
    object  DashboardScreen: Screen()
    data class PlaceDetailScreen(val place: Place):
        Screen()
}
@Model
object AppStatus{
    var currentScreen: Screen =
        Screen.DashboardScreen
}
fun navigateTo(screen: Screen){
    AppStatus.currentScreen = screen
}
