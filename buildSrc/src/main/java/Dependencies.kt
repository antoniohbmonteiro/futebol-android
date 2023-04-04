
object Versions {
    const val composeVersion = "1.4.0"
    const val composeCompiler = "1.4.0"
    const val navigationVersion = "2.5.3"
    const val constraintLayoutVersion = "2.1.4"
    const val retrofit = "2.9.0"
    const val koin = "3.4.0"
    const val koinExt = "3.0.2"
    const val koinCompose = "3.4.3"
    const val koinAndroidxExt = "2.2.2"
}

object Dependencies {

    const val compose = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeUiToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeUiTestManifest =
        "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    const val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val navigation = "androidx.navigation:navigation-ui-ktx:2.5.3"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    const val koinCoreExt = "io.insert-koin:koin-core-ext:${Versions.koinExt}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    const val composeKoinAndroid = "io.insert-koin:koin-androidx-compose:${Versions.koinCompose}"
    const val koinAndroidExt = "io.insert-koin:koin-androidx-ext:${Versions.koinAndroidxExt}"
}