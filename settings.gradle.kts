pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        maven { url = uri("https://maven.gist.build") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven {
            url = uri("https://jitpack.io")
        }
        maven { url = uri("https://maven.gist.build") }
    }
}

rootProject.name = "Contacts"
include(":app")
 