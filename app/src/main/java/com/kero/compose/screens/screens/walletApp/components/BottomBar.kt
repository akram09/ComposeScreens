package com.kero.compose.screens.screens.walletApp.components

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.foundation.Icon
import androidx.ui.material.BottomAppBar
import androidx.ui.tooling.preview.Preview
import com.kero.compose.screens.screens.walletApp.AppTheme

@Composable
fun BottomBar(){
    BottomAppBar() {
        val selectedItem = state { 0 }
        val icons = listOf(
            Icon(VectorAss)
        )
    }
}
@Preview
@Composable
fun previewBottomBar(){
    AppTheme {
        BottomBar()
    }

}