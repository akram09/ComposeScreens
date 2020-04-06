package com.kero.compose.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.state
import androidx.ui.animation.Crossfade
import androidx.ui.core.setContent
import com.kero.compose.screens.screens.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Crossfade(current =AppStatus.currentScreen ) {
                when(it){
                    is Screen.DashboardScreen -> Dashboard(places = getPlaces(resources))
                    is Screen.PlaceDetailScreen -> PlaceDetail(place = it.place)
                }
            }
        }
    }

    override fun onBackPressed() {
        
        if (AppStatus.currentScreen is Screen.PlaceDetailScreen){
            navigateTo(Screen.DashboardScreen)
        }else{
            finish()
        }
    }
}
