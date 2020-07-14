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

        // uncomment this if problems kotlinCompilerVersion= "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
        kotlinCompilerExtensionVersion=Versions.compose
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlinStdlib)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.core)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.layout)
    implementation(Dependencies.Compose.liveData)
    implementation(Dependencies.Compose.graphics)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.savedInstance)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.compiler)
    implementation(Dependencies.Jetpack.navigation)
    implementation(Dependencies.Jetpack.navigation_ktx)
    implementation(Dependencies.Jetpack.appCompat)
    implementation(Dependencies.Jetpack.core_ktx)
    implementation(Dependencies.Jetpack.extensions)
    implementation(Dependencies.Jetpack.extensions)
    implementation(Dependencies.Jetpack.liveData)
    implementation(Dependencies.Jetpack.viewModel)
    implementation(Dependencies.constraintLayout)
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
