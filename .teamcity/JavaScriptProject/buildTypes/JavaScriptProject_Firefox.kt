package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_Firefox : BuildType({
    template(JavaScriptProject.buildTypes.JavaScriptProject_Template)
    uuid = "728fed27-bc89-4c7d-b995-0b5981d3f463"
    id = "JavaScriptProject_Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_FastTests) {
            snapshot {
            }
        }
    }
})
