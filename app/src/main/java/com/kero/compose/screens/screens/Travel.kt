package com.kero.compose.screens.screens

import android.widget.Space
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.*
import androidx.ui.material.icons.outlined.Menu
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.kero.jetpack.compose.playground.R


@Composable
fun Dashboard(){
    MaterialTheme {
        Surface() {
            Column(Modifier.fillMaxHeight().fillMaxWidth()) {
                topActionBar(Modifier.gravity(ColumnAlign.Start))
                Spacer(modifier = Modifier.weight(1f))
                bottomNavigation(Modifier.gravity(ColumnAlign.End))
            }
        }
    }
}


@Composable
fun Content(modifier: Modifier = Modifier.None){
    Column(modifier = modifier) {
        Text(modifier = Modifier.fillMaxWidth(), text = "Where are you going ?" , style = MaterialTheme.typography.h2 , maxLines = 2 )

    }
}


@Preview
@Composable
fun TravelPlaceCard(){
    Column() {

    }
}



@Composable
fun bottomNavigation(modifier:Modifier = Modifier.None, onItemSelected : (index:Int)->Unit = {}){
    var selectedItem  by state{ 0 }
    val icons = listOf(Icons.Filled.Home , Icons.Filled.Favorite ,  vectorResource(id = R.drawable.ic_comment),vectorResource(
        id = R.drawable.ic_user
    ) )
    BottomNavigation(modifier = modifier, color = MaterialTheme.colors.surface) {
        icons.forEachIndexed { index, icon ->
            BottomNavigationItem(icon = {
                Icon(asset = icon , tint = Color.DarkGray)
            },selected = index ==selectedItem
                , onSelected = {
                    selectedItem = index
                    onItemSelected(index)
                })
        }
    }
}


@Composable
fun topActionBar(modifier: Modifier = Modifier.None , onMenuClicked:()->Unit = {} , onNotificationClicked:()->Unit= {}){
    Surface(modifier = modifier.preferredHeight( 56.dp)) {
        Row(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            IconButton(  onClick = onMenuClicked) {
                Icon(asset = Icons.Outlined.Menu)
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = onNotificationClicked) {
                Icon(asset = Icons.Outlined.Notifications)
            }
        }
    }


}

