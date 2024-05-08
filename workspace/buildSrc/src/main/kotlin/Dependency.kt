object Dependency {

    object Compose {
        const val BOM = "androidx.compose:compose-bom:2023.08.00"
        const val UI = "androidx.compose.ui:ui"
        const val GRAPHICS = "androidx.compose.ui:ui-graphics"
        const val PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val MATERIAL = "androidx.compose.material3:material3"
        const val JUNIT4 = "androidx.compose.ui:ui-test-junit4"
        const val TOOLING = "androidx.compose.ui:ui-tooling"
        const val MANIFEST = "androidx.compose.ui:ui-test-manifest"
        const val ACTIVITY = "androidx.activity:activity-compose:1.7.0"
    }

    object AndroidX {
        const val CORE = "androidx.core:core-ktx:1.10.1"
        const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val EXT = "androidx.test.ext:junit:1.1.5"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:3.5.1"
    }

    object Orbit {
        const val CORE = "org.orbit-mvi:orbit-core:7.1.0"
        const val VIEWMODEL = "org.orbit-mvi:orbit-viewmodel:7.1.0"
        const val COMPOSE = "org.orbit-mvi:orbit-compose:7.1.0"
        const val TEST = "org.orbit-mvi:orbit-test:7.1.0"
    }

    object Hilt {
        const val ANDROID = "com.google.dagger:hilt-android:2.51.1"
        const val COMPILER = "com.google.dagger:hilt-android-compiler:2.51.1"
    }
}