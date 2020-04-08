package com.kero.compose.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.animation.Crossfade
import androidx.ui.core.setContent
import com.kero.compose.screens.screens.budgettracker.BudgetTrackerActivity
import com.kero.compose.screens.screens.travelapp.*
import com.kero.jetpack.compose.playground.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this , BudgetTrackerActivity::class.java))
        finish()
    }


}
