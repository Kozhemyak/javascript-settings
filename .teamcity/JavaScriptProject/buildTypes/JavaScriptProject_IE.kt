package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_IE : BuildType({
    template(JavaScriptProject.buildTypes.JavaScriptProject_Template)
    uuid = "JavaScriptProject_IE"
    id = "JavaScriptProject_IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_FastTests) {
            snapshot {
            }
        }
    }
})
