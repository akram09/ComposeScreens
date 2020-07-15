import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

object Plugins{
    const val AndroidApplication = "com.android.application"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val KtlintPlugin = "org.jlleitschuh.gradle.ktlint"

    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

}
fun RepositoryHandler.addRepositories(){
    google()
    jcenter()
    mavenLocal()
    mavenCentral()
    maven( url="https://dl.bintray.com/arrow-kt/arrow-kt/" )
    maven(url = "https://jitpack.io" )
    maven( url ="https://dl.bintray.com/kotlin/kotlinx" )
}
