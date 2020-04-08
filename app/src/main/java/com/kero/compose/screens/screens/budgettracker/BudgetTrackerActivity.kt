package com.kero.compose.screens.screens.budgettracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.MaterialTheme

class BudgetTrackerActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {

                Text(text = "Hello World !!!", style = MaterialTheme.typography.h6)
            }
        }
    }
}