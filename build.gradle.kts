import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.

// buildscript block replaced with buildSrc
plugins {
    kotlin("jvm") // buildSrc provides kotlin-dsl which already pulls in kotlin plugin
    id("de.fayard.buildSrcVersions") version "0.3.2"
    id("com.diffplug.gradle.spotless") version "3.16.0"
    id("pl.allegro.tech.build.axion-release") version "1.10.0"
    id("com.gradle.build-scan") version "2.1"
}

group = "io.pixeloutlaw.materialspark"
version = scmVersion.version

allprojects {
    apply(plugin = "com.diffplug.gradle.spotless")

    repositories {
        google()
        jcenter()
    }

    afterEvaluate {
        tasks.withType<KotlinCompile>().configureEach {
            dependsOn("spotlessApply")
            kotlinOptions.jvmTarget = "1.8"
        }
    }

    spotless {
        kotlin {
            ktlint()
        }

        kotlinGradle {
            ktlint()
        }
    }
}

subprojects {
    version = rootProject.version
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
}