import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.

// buildscript block replaced with buildSrc
plugins {
    kotlin("jvm") // buildSrc provides kotlin-dsl which already pulls in kotlin plugin
    id("de.fayard.buildSrcVersions") version Versions.de_fayard_buildsrcversions_gradle_plugin
    id("com.diffplug.gradle.spotless") version Versions.com_diffplug_gradle_spotless_gradle_plugin
    id("pl.allegro.tech.build.axion-release") version Versions.pl_allegro_tech_build_axion_release_gradle_plugin
    id("com.gradle.build-scan") version Versions.com_gradle_build_scan_gradle_plugin
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