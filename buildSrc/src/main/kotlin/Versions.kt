import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val appcompat: String = "1.0.2" 

    const val constraintlayout: String = "1.1.3" 

    const val core_ktx: String = "1.1.0-alpha03" 

    const val espresso_core: String = "3.1.1" 

    const val androidx_test_ext_junit: String = "1.1.0" 

    const val androidx_test_rules: String = "1.1.1" 

    const val aapt2: String = "3.5.0-alpha02-5228738" 

    const val lint_gradle: String = "26.5.0-alpha02" 

    const val com_diffplug_gradle_spotless_gradle_plugin: String = "3.17.0" 

    const val material: String = "1.0.0" 

    const val com_gradle_build_scan_gradle_plugin: String = "2.1" 

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.3.2" 

    const val junit_junit: String = "4.12" 

    const val org_jetbrains_kotlin: String = "1.3.20"

    const val robolectric: String = "4.1" 

    const val pl_allegro_tech_build_axion_release_gradle_plugin: String = "1.10.0" 

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "5.1.1"

        const val currentVersion: String = "5.1.1"

        const val nightlyVersion: String = "5.3-20190130000104+0000"

        const val releaseCandidate: String = "5.2-rc-1"
    }
}
