plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.myfirstcompose"
    compileSdk = SdkVersions.compileSdk

    defaultConfig {
        applicationId = "com.example.myfirstcompose"
        minSdk = SdkVersions.minSdk
        targetSdk = SdkVersions.targetSdk
        versionCode = AppVersions.androidVersionCode
        versionName = AppVersions.androidVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependency.AndroidX.CORE)
    implementation(Dependency.AndroidX.LIFECYCLE)
    implementation(Dependency.Compose.ACTIVITY)
    implementation(platform(Dependency.Compose.BOM))
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.GRAPHICS)
    implementation(Dependency.Compose.PREVIEW)
    implementation(Dependency.Compose.MATERIAL)
    testImplementation(Dependency.Test.JUNIT)
    androidTestImplementation(Dependency.Test.EXT)
    androidTestImplementation(Dependency.Test.ESPRESSO)
    androidTestImplementation(platform(Dependency.Compose.BOM))
    androidTestImplementation(Dependency.Compose.JUNIT4)
    debugImplementation(Dependency.Compose.TOOLING)
    debugImplementation(Dependency.Compose.MANIFEST)

    // Orbit
    implementation(Dependency.Orbit.CORE)
    implementation(Dependency.Orbit.VIEWMODEL)
    implementation(Dependency.Orbit.COMPOSE)
    testImplementation(Dependency.Orbit.TEST)

    // Hilt
    implementation(Dependency.Hilt.ANDROID)
    kapt(Dependency.Hilt.COMPILER)
}

kapt {
    correctErrorTypes = true
}
