package com.kero.compose.screens.base

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.ui.graphics.ScaleFit
import androidx.ui.unit.PxSize
import java.lang.Float.max

val Crop = object: ScaleFit {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun scale(srcSize: PxSize, dstSize: PxSize): Float {
        return max(
            ScaleFit.FillWidth.scale(srcSize, dstSize),
                    ScaleFit.FillHeight.scale(srcSize, dstSize)
        )
    }
}