pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        flatDir {
            dirs("libs")
        }
        google()
        mavenCentral()
        maven { url = uri("https://jcenter.bintray.com/" )}
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://github.com/psiegman/mvn-repo/raw/master/releases") }
    }
}

rootProject.name = "BookReader"
include(":app")
