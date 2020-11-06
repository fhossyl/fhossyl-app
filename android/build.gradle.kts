plugins {
  id("org.jetbrains.compose") version "0.1.0-build63"
  id("com.android.application")
  kotlin("android")
}

group = "org.fhossyl"
version = "1.0-SNAPSHOT"

repositories {
  google()
}

dependencies {
  implementation(project(":common"))
}

android {
  compileSdkVersion(29)

  defaultConfig {
    applicationId = "org.fhossyl.android"
    minSdkVersion(24)
    targetSdkVersion(29)
    versionCode = 1
    versionName = "1.0"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
}