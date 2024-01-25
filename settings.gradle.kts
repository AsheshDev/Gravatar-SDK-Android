pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        exclusiveContent{
            forRepository {
                maven {
                    url = uri("https://a8c-libs.s3.amazonaws.com/android")
                }
            }
            filter {
                includeGroup("com.automattic.android")
                includeGroup("com.automattic.android.publish-to-s3")
            }
        }
    }
    plugins {
        id ("com.automattic.android.publish-to-s3") version ("0.10.0")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "gravatar"
include(":gravatar")
include(":app")
