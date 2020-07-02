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
        kotlinCompilerExtensionVersion="0.1.0-dev08"
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")
    val compose_version = "0.1.0-dev08"

    implementation("androidx.compose:compose-runtime:$compose_version")
    implementation("androidx.ui:ui-android-text:$compose_version")
    implementation("androidx.ui:ui-animation:$compose_version")
    implementation("androidx.ui:ui-animation-core:$compose_version")
    implementation("androidx.ui:ui-core:$compose_version")
    implementation("androidx.ui:ui-foundation:$compose_version")
    implementation("androidx.ui:ui-framework:$compose_version")
    implementation("androidx.ui:ui-geometry:$compose_version")
    implementation("androidx.ui:ui-graphics:$compose_version")
    implementation("androidx.ui:ui-layout:$compose_version")
    implementation("androidx.ui:ui-material:$compose_version")
    implementation("androidx.ui:ui-material-icons-core:$compose_version")
    implementation("androidx.ui:ui-material-icons-extended:$compose_version")
    implementation("androidx.ui:ui-platform:$compose_version")
    implementation("androidx.ui:ui-test:$compose_version")
    implementation("androidx.ui:ui-text:$compose_version")
    implementation("androidx.ui:ui-tooling:$compose_version")
    implementation("androidx.ui:ui-unit:$compose_version")
    implementation("androidx.ui:ui-util:$compose_version")
    implementation("androidx.ui:ui-vector:$compose_version")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.1.0")


    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
