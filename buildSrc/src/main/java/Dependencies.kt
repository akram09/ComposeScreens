object Dependencies{
    object Compose{
        const val compiler = "androidx.compose:compose-compiler:${Versions.compose}"
        const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
        const val runtime_dispatch = "androidx.compose.runtime:runtime-dispatch:${Versions.compose}"
        const val animation = "androidx.compose.animation:animation:${Versions.compose}"
        const val animation_core = "androidx.compose.animation:animation-core:${Versions.compose}"
        const val geometry = "androidx.compose.ui:ui-geometry:${Versions.compose}"
        const val text_foundation = "androidx.compose.foundation:foundation-text:${Versions.compose}"
        const val text_core = "androidx.compose.ui:ui-text:${Versions.compose}"
        const val text_android = "androidx.compose.ui:ui-text-android:${Versions.compose}"
        const val unit = "androidx.compose.ui:ui-unit:${Versions.compose}"
        const val util = "androidx.compose.ui:ui-util:${Versions.compose}"
        const val core = "androidx.compose.ui:ui:${Versions.compose}"
        const val graphics  = "androidx.compose.ui:ui-graphics:${Versions.compose}"
        const val foundation ="androidx.compose.foundation:foundation:${Versions.compose}"
        const val tooling = "androidx.ui:ui-tooling:${Versions.compose}"
        const val layout  = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val material_icons = "androidx.compose.material:material-icons-core:${Versions.compose}"
        const val material_icons_extended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
        const val savedInstance = "androidx.compose.runtime:runtime-saved-instance-state:${Versions.compose}"
        const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    }
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    object Coroutine{
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    }
    object Jetpack{
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val core_ktx  = "androidx.core:core-ktx:${Versions.appCompat}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val navigation="androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigation_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }
}