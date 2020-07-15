package com.kero.compose.screens.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

fun <R,T>ViewModel.launchCoroutines(coroutine:suspend (T)->R, param:T, onResult:(R)->Unit){
    viewModelScope.launch {
        val result = async (Dispatchers.Unconfined){ coroutine(param)  }
        launch(Dispatchers.Main){
            onResult(result.await())
        }
    }
}