package JavaScriptProject

import JavaScriptProject.buildTypes.*
import JavaScriptProject.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "JavaScriptProject"
    id = "JavaScriptProject"
    parentId = "_Root"
    name = "JavaScript Project"

    vcsRoot(JavaScriptProject_HttpsGithubComG0t4teamcityCourseCardsGit)

    buildType(JavaScriptProject_FastTests)
    buildType(JavaScriptProject_Firefox)
    buildType(JavaScriptProject_Chrome)
    buildType(JavaScriptProject_DeployToStagging)

    template(JavaScriptProject_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComKozhemyakJavascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
