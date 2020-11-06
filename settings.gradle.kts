pluginManagement {
  repositories {
    google()
    jcenter()
    gradlePluginPortal()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
  }

}
rootProject.name = "fhossyl-app"


include(":android")
include(":desktop")
include(":common")

