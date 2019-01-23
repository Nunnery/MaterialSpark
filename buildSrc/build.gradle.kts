plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "1.1.1"
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.0-alpha01")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.11")
}
