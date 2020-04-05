package com.kero.compose.screens.screens

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.*
import androidx.ui.material.icons.outlined.Menu
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.res.vectorResource
import androidx.ui.unit.dp
import com.kero.compose.screens.base.Crop
import com.kero.jetpack.compose.playground.R

@Composable
fun Dashboard(places:List<Place>){
    AppTheme {
        Scaffold(bottomAppBar = { bottomNavigation()} , topAppBar = { topActionBar()}) {
            MainContainer(places = places , modifier = it.padding(start = 20.dp))
        }

    }
}



@Composable
fun MainContainer(modifier: Modifier= Modifier.None , places: List<Place>){
    VerticalScroller(modifier = modifier) {
        Column() {
            SearchPlace()
            Spacer(modifier = Modifier.preferredHeight(20.dp))
            PlacesCards(places = places)
            Spacer(modifier = Modifier.preferredHeight(10.dp))
            PlacesList(places = places)
        }
    }

}

@Composable
fun SearchPlace(modifier: Modifier= Modifier.None){
    Column(modifier = modifier.fillMaxWidth().padding(end = 30.dp)) {
        Text(text = "Where are you \n going?" , style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.preferredHeight(30.dp))
        Box(shape = RoundedCornerShape(4.dp) , backgroundColor = Color(0xFFE8ECEE) , modifier = Modifier.preferredHeight(45.dp) ,gravity = ContentGravity.Center ){
            Row(modifier = Modifier.padding(5.dp)) {
                Icon(asset = Icons.Filled.Room,tint = MaterialTheme.colors.onPrimary,modifier = Modifier.padding(end = 7.dp))
                Text(text = "E.g: New York, United States")
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}
@Composable
fun PlacesList(places: List<Place>, modifier: Modifier = Modifier.None){
    Column(modifier = modifier) {
        places.forEach {
            PlaceItem(place = it)
        }
    }

}

@Composable
fun PlaceItem(modifier: Modifier= Modifier.None , place:Place){
    Row(modifier = modifier.fillMaxWidth().padding(bottom = 10.dp)) {
        val imageModifier = Modifier.preferredSize(70.dp).clip(RoundedCornerShape(6.dp))
        Image(asset = place.image,modifier = imageModifier , scaleFit = Crop )
        Spacer(modifier = Modifier.preferredWidth(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            val emphasisLevels = EmphasisAmbient.current
            ProvideEmphasis(emphasis = emphasisLevels.high) {
                Text(text = place.name , style = MaterialTheme.typography.subtitle2 , modifier = Modifier.fillMaxWidth(), maxLines = 2 )
            }
            Spacer(modifier = Modifier.preferredHeight(2.dp))
            ProvideEmphasis(emphasis = emphasisLevels.medium) {
                Text(text = place.location , style = MaterialTheme.typography.subtitle1 )
            }
            Spacer(modifier = Modifier.preferredHeight(3.dp))
            ProvideEmphasis(emphasis = emphasisLevels.high) {
                Text(text ="${place.priceForNight.toInt()}/night" , style = MaterialTheme.typography.subtitle2 )
            }
        }
    }
}


@Composable
fun PlacesCards(modifier: Modifier= Modifier.None, places:List<Place> ){
    HorizontalScroller(modifier = Modifier.padding(top = 10.dp , bottom = 10.dp)) {
        Row(modifier = modifier) {
            places.forEach {
                TravelPlaceCard(place = it , modifier = Modifier.padding(end = 10.dp))
            }
        }
    }

}





@Composable
fun TravelPlaceCard(place:Place ,  modifier: Modifier = Modifier.None){
    Column (modifier = modifier.preferredWidthIn(maxWidth = 150.dp)){
        val imageModifier = Modifier.preferredHeight(180.dp).preferredWidth(150.dp).clip(RoundedCornerShape(4.dp))
        Image(asset = place.image , modifier = imageModifier , scaleFit = Crop)
        Spacer(modifier = Modifier.preferredHeight(3.dp))
        val emphasisLevels = EmphasisAmbient.current
        ProvideEmphasis(emphasis = emphasisLevels.high) {
            Text(text = place.name , style = MaterialTheme.typography.subtitle1 , modifier = Modifier.fillMaxWidth(), maxLines = 2 )
        }
        ProvideEmphasis(emphasis = emphasisLevels.medium) {
            Text(text = place.location , style = MaterialTheme.typography.subtitle2  )
        }
        
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
                Icon(asset = icon )
            },selected = index ==selectedItem
                , onSelected = {
                    selectedItem = index
                    onItemSelected(index)
                }, activeColor = Color.DarkGray , inactiveColor = MaterialTheme.colors.onPrimary)
        }
    }
}


