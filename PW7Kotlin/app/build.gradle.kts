plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.pw7kotlin"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.pw7kotlin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    testImplementation ("junit:junit:4.13.2")

    // Тестирование пользовательского интерфейса с использованием Espresso
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.6.1")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.6.1")
    androidTestImplementation ("androidx.test.espresso:espresso-accessibility:3.6.1")
    androidTestImplementation ("androidx.test.espresso:espresso-web:3.6.1")
    androidTestImplementation ("androidx.test.espresso.idling:idling-concurrent:3.6.1")

    // JUnit extensions для Android
    androidTestImplementation ("androidx.test.ext:junit:1.2.1")
    androidTestImplementation ("androidx.test.ext:junit-ktx:1.2.1")

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.24")

    implementation ("com.github.bumptech.glide:glide:4.16.0")
    kapt ("com.github.bumptech.glide:compiler:4.16.0")

    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

    implementation ("androidx.core:core-ktx:1.10.1")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
}
kapt {
    correctErrorTypes = true
}