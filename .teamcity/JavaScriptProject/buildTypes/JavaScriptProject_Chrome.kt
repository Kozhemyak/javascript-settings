package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_Chrome : BuildType({
    template(JavaScriptProject.buildTypes.JavaScriptProject_Template)
    uuid = "4e548859-2dea-4811-8f04-0addae46c0f4"
    id = "JavaScriptProject_Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_FastTests) {
            snapshot {
            }
        }
    }
})
