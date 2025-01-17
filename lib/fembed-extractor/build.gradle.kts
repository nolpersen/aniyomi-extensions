plugins {
    id("com.android.library")
    id("kotlinx-serialization") // for the DTO
    kotlin("android")
}

android {
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
    }
}

dependencies {
    compileOnly(libs.kotlin.stdlib)
    compileOnly(libs.kotlin.json)
    compileOnly(libs.okhttp)
    compileOnly(libs.aniyomi.lib)
}
// BUMPS: 0
