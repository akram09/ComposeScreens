package com.kero.compose.screens.screens.travelapp.pages.detail

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.*
import androidx.ui.unit.dp
import com.kero.compose.screens.screens.travelapp.api.Place
import com.kero.compose.screens.screens.travelapp.components.topActionBar

@Composable
fun PlaceDetail(place: Place){
    MaterialTheme(colors =  lightColorPalette(primary = Color
        .White ,
        onPrimary = Color(0xFF7F949F),
        secondary = Color(0xFFC20029))) {
        Scaffold(topBar = {
            topActionBar(
                navigationIcon = Icons.Filled.ArrowBack,
                onNavigationIconClicked = {
                    // navigate back
                })
        } , floatingActionButton = {
            FloatingActionButton(onClick = {} , backgroundColor = Color.Black) {
                Icon(asset = Icons.Filled.Favorite , tint = Color.White)
            }
        }) {
            mainContainer(
                place = place
            )
        }
    }
}
@Composable
fun mainContainer(modifier: Modifier = Modifier.None,place: Place){
    Surface(modifier = modifier) {
        VerticalScroller(modifier = Modifier.fillMaxSize()) {
            Column() {
                Box(modifier = Modifier.fillMaxWidth().preferredHeight(250.dp)){
                    Image(asset = place.image , contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize().clip(
                        RoundedCornerShape(10.dp)))
                }
                Spacer(modifier = Modifier.preferredHeight(20.dp))
                PlaceDetailHeader(
                    placeTitle = place.name,
                    placeLocation = place.location,
                    placePrice = place.priceForNight
                )
                Spacer(modifier = Modifier.preferredHeight(20.dp))
                PlaceDetailContent(
                    placeDetail = place.detail
                )
                Spacer(modifier = Modifier.preferredHeight(60.dp))

            }
        }
    }
}
@Composable
fun PlaceDetailHeader(modifier: Modifier = Modifier.None , placeTitle :String , placeLocation:String , placePrice:Double){
    Column() {
        val emphasisLevels = EmphasisAmbient.current
        Row() {
            Text(text = placeTitle , style = MaterialTheme.typography.h6 )
            Spacer(modifier = Modifier.weight(1f))
            Icon(asset = Icons.Filled.Add , modifier =Modifier.padding(end = 20.dp) , tint = Color.Black)
        }
        Spacer(modifier = Modifier.preferredHeight(10.dp))
        Row() {
            Icon(asset = Icons.Filled.Create)
            Spacer(modifier = Modifier.preferredWidth(2.dp))
            ProvideEmphasis(emphasis = emphasisLevels.medium) {
                Text(text = placeLocation , style = MaterialTheme.typography.subtitle1)
            }

        }

        Spacer(modifier = Modifier.preferredHeight(10.dp))
        ProvideEmphasis(emphasis = emphasisLevels.high) {
            Text(text = "$${placePrice.toInt()}/night" , style = MaterialTheme.typography.h6)
        }

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
