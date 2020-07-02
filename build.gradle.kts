// Top-level build file where you can add configuration options common to all sub-projects/modules.

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

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
