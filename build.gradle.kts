// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins{
    id("io.gitlab.arturbosch.detekt") version Versions.detekt
    id("org.jlleitschuh.gradle.ktlint") version Versions.KtlintPlugin
    id("org.jlleitschuh.gradle.ktlint-idea") version Versions.KtlintPlugin
}
buildscript {

    repositories {
        addRepositories()
    }
    dependencies {
        classpath(Plugins.gradlePlugin)
        classpath(Plugins.kotlinPlugin)
    }
}

allprojects {
    repositories {
        addRepositories()
    }
}
subprojects{
    apply {
        plugin("io.gitlab.arturbosch.detekt")
        plugin("org.jlleitschuh.gradle.ktlint")
    }

    ktlint {
        debug.set(false)
        version.set(Versions.KTLINT)
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(false)
        enableExperimentalRules.set(true)
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    detekt {
        config = rootProject.files("detekt.yml")
        reports {
            html {
                enabled = true
                destination = file("build/reports/detekt.html")
            }
        }
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
