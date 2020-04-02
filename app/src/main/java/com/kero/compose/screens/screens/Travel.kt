package com.kero.compose.screens.screens

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.NotificationImportant
import androidx.ui.material.icons.filled.Notifications
import androidx.ui.tooling.preview.Preview
import com.kero.jetpack.compose.playground.R

@Preview
@Composable
fun Dashboard(){
    Surface() {

    }
}
@Composable
@Preview()
fun TopBar(surfaceColor: Color = Color.Transparent){
   TopAppBar(title = {
       Text(text = "First Title")
   } , navigationIcon = {
       IconButton(onClick = {}) {
           Icon(asset = Icons.Filled.Menu)
       }
   } , actions = {
       IconButton(onClick = {}) {
           Icon(asset = Icons.Filled.NotificationImportant)
       }
   } )
}
@Composable
@Preview
fun BottomBar(){
    Docker
}
