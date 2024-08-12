pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven (url = "https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        maven (url = "https://dl.bintray.com/kotlin/kotlin-eap" )
        maven (url = "https://api.xposed.info/" )
        maven (url = "https://jitpack.io" )
    }
}

rootProject.name = "QwQ"
include(
    ":app",
    ":qqinterface"
)
include(":processor")
include(":maple")
