package com.kero.compose.screens.screens

import android.widget.Space
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.tag
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.geometry.Offset
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.kero.compose.screens.base.Crop
import com.kero.jetpack.compose.playground.R

@Composable
fun PlaceDetail(place: Place){
    AppTheme {
        Scaffold(topAppBar = { topActionBar(navigationIcon = Icons.Filled.ArrowBack)} , floatingActionButton = {
            FloatingActionButton(onClick = {} , backgroundColor = Color.Black) {
                Icon(asset = Icons.Filled.Flight , tint = Color.White)
            }
        }) {
            mainContainer(it.padding(start= 20.dp , end= 20.dp), place)
        }
    }
}
@Composable
fun mainContainer(modifier: Modifier = Modifier.None,place:Place){
    Surface(modifier = modifier) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxWidth().preferredHeight(250.dp)){
                Image(asset = place.image , scaleFit = Crop, modifier = Modifier.fillMaxSize().clip(
                    RoundedCornerShape(10.dp)))
            }
            Spacer(modifier = Modifier.preferredHeight(20.dp))
            PlaceDetailHeader(placeTitle = place.name ,placeLocation =  place.location ,placePrice =  place.priceForNight)
            Spacer(modifier = Modifier.preferredHeight(20.dp))
            PlaceDetailContent(placeDetail = place.detail)

        }

    }
}
@Composable
fun PlaceDetailHeader(modifier: Modifier = Modifier.None , placeTitle :String , placeLocation:String , placePrice:Double){
    Column() {
        Row() {
            Text(text = placeTitle , style = MaterialTheme.typography.h6 )
            Spacer(modifier = Modifier.weight(1f))
            Icon(asset = Icons.Filled.Bookmark , modifier =Modifier.padding(end = 20.dp) , tint = Color.Black)
        }
        Spacer(modifier = Modifier.preferredHeight(10.dp))
        Row() {
            Icon(asset = Icons.Filled.Room)
            Spacer(modifier = Modifier.preferredWidth(2.dp))
            Text(text = placeLocation , style = MaterialTheme.typography.subtitle2)
        }
        Spacer(modifier = Modifier.preferredHeight(10.dp))
        Text(text = "${placePrice.toInt()}/days" , style = MaterialTheme.typography.subtitle1)
    }
}
@Composable
fun PlaceDetailContent(modifier: Modifier = Modifier.None , placeDetail:String){
    Column() {
        Text(text = "Details" , style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.preferredHeight(5.dp))
        Text(text =placeDetail , style = MaterialTheme.typography.body1)
    }
}
