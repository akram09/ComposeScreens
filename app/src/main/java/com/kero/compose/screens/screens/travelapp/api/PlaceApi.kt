package com.kero.compose.screens.screens.travelapp.api

import android.content.res.Resources
import androidx.ui.graphics.ImageAsset
import androidx.ui.graphics.imageFromResource
import com.kero.compose.screens.R
import kotlinx.coroutines.delay

data class Place(val name:String, val location:String, val priceForNight:Double,
                 val image : ImageAsset, val detail:String="" )

suspend fun  getPlaces(resources: Resources):List<Place> {
    delay(200)
    return listOf(
        Place(
            "Tincidunt Pool",
            "Madrid, Spain",
            200.0,
            imageFromResource(res = resources, resId = R.drawable.place5),
            detail = "Pellentesque in ipsum id orci porta dapibus. " +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. " +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada. " +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. " +
                    "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."
        ),
        Place(
            "Curabitur Beach",
            "Rome, Italy",
            100.0,
            imageFromResource(res = resources, resId = R.drawable.place4),
            detail = "Pellentesque in ipsum id orci porta dapibus. " +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. " +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada. " +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. " +
                    "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."
        ),
        Place(
            "Hotel Dolah Amet & Suites",
            "London, England",
            100.0,
            imageFromResource(res = resources, resId = R.drawable.place1),
            detail = "Pellentesque in ipsum id orci porta dapibus. " +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. " +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada. " +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. " +
                    "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."
        ),
        Place(
            "Beach Mauris Blandit",
            "Lisbon, Portugal",
            100.0,
            imageFromResource(res = resources, resId = R.drawable.place2),
            detail = "Pellentesque in ipsum id orci porta dapibus. " +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. " +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada.\n \n" +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. \n" +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. \n" +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada. " +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. " +
                    "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."
        ),
        Place(
            "Ipsum Restaurant",
            "Paris, France",
            200.0,
            imageFromResource(res = resources, resId = R.drawable.place3),
            detail = "Pellentesque in ipsum id orci porta dapibus. " +
                    "Nulla porttitor accumsan tincidunt. Donec rutrum " +
                    " congue leo eget malesuada. " +
                    " Praesent sapien massa, convallis a pellentesque " +
                    " nec, egestas non nisi. Donec rutrum congue leo eget malesuada. " +
                    "Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. " +
                    "Sed porttitor lectus nibh. Donec sollicitudin molestie malesuada. " +
                    "Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. " +
                    "Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui."
        )
    )
}
