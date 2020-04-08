package com.kero.compose.screens.utils

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.paint
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.geometry.Offset
import androidx.ui.graphics.*
import androidx.ui.graphics.painter.ImagePainter
import androidx.ui.graphics.painter.Painter
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.graphics.vector.VectorPainter
import androidx.ui.graphics.vector.drawVector
import androidx.ui.layout.Stack
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.preferredSize
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.PxSize
import androidx.ui.unit.dp

@Composable
fun BadgeIcon(icon: VectorAsset, tint: Color, modifier: Modifier = Modifier.None){
    Stack(modifier = modifier.preferredSize(24.dp)) {
        Icon(asset = icon , tint = tint)
        Box(shape = CircleShape  , backgroundColor = Color.Red , modifier = Modifier.preferredSize(10.dp).gravity(
            Alignment.TopEnd))
    }

}

