package com.kero.compose.screens.utils

import android.view.ViewGroup
import androidx.compose.Composable
import androidx.compose.Composition
import androidx.compose.Recomposer
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.ui.core.setContent

fun ViewGroup.setContentLifecycle(
    lifecycleOwner: LifecycleOwner,
    content : @Composable ()->Unit
): Composition {
    val composition = setContent(recomposer = Recomposer.current(), content = content)
    val observer = object : DefaultLifecycleObserver {
        override fun onDestroy(owner: LifecycleOwner) {
            owner.lifecycle.removeObserver(this)
            composition.dispose()
        }
    }
    lifecycleOwner.lifecycle.addObserver(observer)
    return composition
}