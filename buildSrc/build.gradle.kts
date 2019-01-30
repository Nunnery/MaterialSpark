plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "1.1.3"
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.0-alpha02")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.20")
}
