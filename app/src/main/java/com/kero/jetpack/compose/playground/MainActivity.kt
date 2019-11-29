package com.kero.jetpack.compose.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.*
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            firstView()
        }
    }
    @Composable
    fun firstView(){
        Log.e("errr", "entered")
        MaterialTheme {
            ModalDrawerLayout(DrawerState.Opened , {
                Log.e("errr", "changed")
            }, drawerContent = {
                Text("Hello World ")
            }, bodyContent = {
                Text("heu")
            })

        }
    }
}
