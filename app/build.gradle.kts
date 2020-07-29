plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")
    defaultConfig {
        applicationId ="com.kero.compose.screens"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode=1
        versionName="1.0"
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    buildFeatures {
        compose= true
    }
    composeOptions {
        kotlinCompilerVersion= "1.4.0-dev-withExperimentalGoogleExtensions-20200720"
        kotlinCompilerExtensionVersion=Versions.compose
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class).configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = freeCompilerArgs.toMutableList() + listOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check")
        }
    }
}

dependencies {
    implementation(Dependencies.kotlinStdlib)
    // compose dependencies
    implementation(Dependencies.Compose.runtime_dispatch)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.animation)
    implementation(Dependencies.Compose.animation_core)
    implementation(Dependencies.Compose.geometry)
    implementation(Dependencies.Compose.material_icons)
    implementation(Dependencies.Compose.material_icons_extended)
    implementation(Dependencies.Compose.text_android)
    implementation(Dependencies.Compose.text_core)
    implementation(Dependencies.Compose.text_foundation)
    implementation(Dependencies.Compose.unit)
    implementation(Dependencies.Compose.util)
    implementation(Dependencies.Compose.core)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.layout)
    implementation(Dependencies.Compose.liveData)
    implementation(Dependencies.Compose.graphics)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.savedInstance)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.compiler)

    // jetpack dependencies
    implementation(Dependencies.Jetpack.navigation)
    implementation(Dependencies.Jetpack.navigation_ktx)
    implementation(Dependencies.Jetpack.appCompat)
    implementation(Dependencies.Jetpack.core_ktx)
    implementation(Dependencies.Jetpack.extensions)
    implementation(Dependencies.Jetpack.extensions)
    implementation(Dependencies.Jetpack.lifecycleCommon)
    implementation(Dependencies.Jetpack.lifecycleRuntime)
    implementation(Dependencies.Jetpack.commonJava8)
    implementation(Dependencies.Jetpack.liveData)
    implementation(Dependencies.Jetpack.viewModel)
    implementation(Dependencies.constraintLayout)
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
