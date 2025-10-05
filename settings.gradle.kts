pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}
rootProject.name = "connectly"
include("app")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("user")
include("chat")
include("notification")
include("common")