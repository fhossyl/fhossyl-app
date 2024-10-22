buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    classpath("com.android.tools.build:gradle:4.0.1")
  }
}

group = "org.fhossyl"
version = "1.0-SNAPSHOT"

allprojects {
  repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
  }
}