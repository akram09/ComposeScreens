package com.kero.compose.screens.screens.travelapp

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.IconButton
import androidx.ui.material.Surface
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.unit.dp

@Composable
fun topActionBar(modifier: Modifier = Modifier.None, onNavigationIconClicked:()->Unit = {}, navigationIcon: VectorAsset,onNotificationClicked:()->Unit= {}){
    Surface(modifier = modifier.preferredHeight( 56.dp)) {
        Row(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            IconButton(  onClick = onNavigationIconClicked) {
                Icon(asset = navigationIcon , tint = Color.Black)
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = onNotificationClicked) {
                BadgeIcon(
                    icon = Icons.Outlined.Notifications,
                    tint = Color.Black
                )
            }

        }
    }
}
@Composable
fun BadgeIcon(icon:VectorAsset , tint:Color , modifier: Modifier= Modifier.None){
    Stack(modifier = modifier) {
        Icon(asset = icon , tint = tint)
        Box(shape = CircleShape  , backgroundColor = Color.Red , modifier = Modifier.preferredSize(12.dp).gravity(Alignment.TopEnd))
    }
}