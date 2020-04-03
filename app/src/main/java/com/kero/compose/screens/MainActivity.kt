package com.kero.compose.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.Composable
import androidx.compose.Composer
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview
import com.kero.compose.screens.screens.Dashboard
import com.kero.compose.screens.screens.getPlaces

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Dashboard(places = getPlaces(resources = resources))
        }
    }
}
