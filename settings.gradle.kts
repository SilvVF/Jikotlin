pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        files("../gradle/libs.versions.toml")
    }
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Jikotlin"
include(":shared")