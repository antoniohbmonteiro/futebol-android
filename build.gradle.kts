plugins {
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}

buildscript {
    dependencies {
        classpath("com.github.ben-manes:gradle-versions-plugin:0.46.0")
    }
}