@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.github.ben-manes.versions")
}

android {
    namespace = "br.com.antoniomonteiro.futebol"
    compileSdk = 33

    defaultConfig {
        applicationId = "br.com.antoniomonteiro.futebol"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    val immaturityLevels = listOf("rc", "cr", "m", "beta", "alpha", "preview") // order is important
    val immaturityRegexes = immaturityLevels.map { ".*[.\\-]$it[.\\-\\d]*".toRegex(RegexOption.IGNORE_CASE) }
    fun immaturityLevel(version: String): Int = immaturityRegexes.indexOfLast { version.matches(it) }
    rejectVersionIf { immaturityLevel(candidate.version) > immaturityLevel(currentVersion) }
}

dependencies {

    // ToDo passar todos para Dependencies
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.navigation)
    implementation(Dependencies.navigationFragment)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation("androidx.compose.material3:material3:1.1.0-beta01")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(Dependencies.composeUiTestJunit)
    implementation(Dependencies.compose)
    implementation(Dependencies.composeUiToolingPreview)
//    debugImplementation(Dependencies.composeTooling)
//    debugImplementation(Dependencies.composeUiTestManifest)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitGsonConverter)

    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinCoreExt)
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.composeKoinAndroid)
//    implementation(Dependencies.koinAndroidExt)

}