object Versions {
    val composeVersion = "1.4.0"
    val navigationVersion = "2.5.3"
    val constraintLayoutVersion = "2.1.4"
}

object Dependencies {

    val compose = "androidx.compose.ui:ui:${Versions.composeVersion}"
    val composeUiToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    val navigation = "androidx.navigation:navigation-ui-ktx:2.5.3"
    val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
}