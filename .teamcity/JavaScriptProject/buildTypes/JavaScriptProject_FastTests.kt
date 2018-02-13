package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_FastTests : BuildType({
    template(JavaScriptProject.buildTypes.JavaScriptProject_Template)
    uuid = "b8bebc28-5f33-4328-9409-be3d6fe0d56a"
    id = "JavaScriptProject_FastTests"
    name = "01. Fast Tests"
})
