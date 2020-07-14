package com.kero.compose.screens.screens.travelapp.pages.dashboard

import com.kero.compose.screens.screens.travelapp.api.Place

sealed class DashboardAction
data class GoToPlaceDetail(val placeDetail:Place): DashboardAction()