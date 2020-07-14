package com.kero.compose.screens.screens.travelapp.components

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.*
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.Stack
import androidx.ui.layout.preferredSize
import androidx.ui.unit.dp

@Composable
fun BadgeIcon(icon: VectorAsset, tint: Color, modifier: Modifier = Modifier.None){
    Stack(modifier = modifier.preferredSize(24.dp)) {
        Icon(asset = icon , tint = tint)
        Box(shape = CircleShape  , backgroundColor = Color.Red , modifier = Modifier.preferredSize(10.dp).gravity(
            Alignment.TopEnd))
    }

}

