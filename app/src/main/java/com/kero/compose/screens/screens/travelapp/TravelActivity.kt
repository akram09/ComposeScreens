package com.kero.compose.screens.screens.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.animation.Crossfade
import androidx.ui.core.setContent

class TravelActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Crossfade(current = AppStatus.currentScreen ) {
                when(it){
                    is Screen.DashboardScreen -> Dashboard(
                        places = getPlaces(
                            resources
                        )
                    )
                    is Screen.PlaceDetailScreen -> PlaceDetail(
                        place = it.place
                    )
                }
            }
        }
    }
    override fun onBackPressed() {

        if (AppStatus.currentScreen is Screen.PlaceDetailScreen){
            navigateTo(
                Screen.DashboardScreen
            )
        }else{
            finish()
        }
    }
}
