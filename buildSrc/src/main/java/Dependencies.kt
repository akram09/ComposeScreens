object Dependencies{
    object Compose{
        const val compiler = "androidx.compose:compose-compiler:${Versions.compose}"
        const val runtime = "androidx.compose:compose-runtime:${Versions.compose}"
        const val core = "androidx.ui:ui-core:${Versions.compose}"
        const val foundation ="androidx.ui:ui-foundation:${Versions.compose}"
        const val tooling = "androidx.ui:ui-tooling:${Versions.compose}"
        const val layout  = "androidx.ui:ui-layout:${Versions.compose}"
        const val material = "androidx.ui:ui-material:${Versions.compose}"
        const val savedInstance = "androidx.ui:ui-saved-instance-state:${Versions.compose}"
        const val liveData = "androidx.ui:ui-livedata:${Versions.compose}"
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
    }
}