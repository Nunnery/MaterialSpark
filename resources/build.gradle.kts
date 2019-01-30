import com.android.build.gradle.internal.dsl.TestOptions

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(15)
        targetSdkVersion(28)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    testOptions {
        unitTests(closureOf<TestOptions.UnitTestOptions> {
            isIncludeAndroidResources = true
        })
    }
}

dependencies {
    implementation(project(":base"))

    testImplementation(Libs.junit_junit)
    testImplementation(Libs.robolectric)
    androidTestImplementation(Libs.androidx_test_ext_junit)
    androidTestImplementation(Libs.androidx_test_rules)
    androidTestImplementation(Libs.espresso_core)
}
