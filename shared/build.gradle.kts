plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization") version "1.8.21"
    id("maven-publish")
}


@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation(libs.kotlin.serialization)
                implementation(libs.kotlinx.datetime)
                implementation(libs.ktor.serialization.json)
                implementation(libs.ktor.core)
                implementation(libs.ktor.cio)
                implementation(libs.ktor.contentnegotiation)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(libs.junit)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.silvvf"
                artifactId = "Jikotlin"
                version = "1.0.1"

                afterEvaluate {
                    from(components["kotlin"])
                }
            }
        }
    }

    android {
        publishLibraryVariants("release", "debug")
    }
}


android {
    namespace = "io.silv.jikotlin"
    compileSdk = 33
    defaultConfig {
        minSdk = 21
    }
}