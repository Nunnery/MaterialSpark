import com.android.build.gradle.internal.dsl.TestOptions

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "io.pixeloutlaw.materialspark"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    testOptions {
        unitTests(closureOf<TestOptions.UnitTestOptions> {
            isIncludeAndroidResources = true
        })
    }
}

dependencies {
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.appcompat)
    implementation(Libs.core_ktx)
    implementation(Libs.constraintlayout)
    implementation(Libs.material)
    testImplementation(Libs.junit_junit)
    testImplementation(Libs.robolectric)
    androidTestImplementation(Libs.androidx_test_ext_junit)
    androidTestImplementation(Libs.androidx_test_rules)
    androidTestImplementation(Libs.espresso_core)
}
