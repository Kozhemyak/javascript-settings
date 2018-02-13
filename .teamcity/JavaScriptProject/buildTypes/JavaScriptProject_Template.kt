package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object JavaScriptProject_Template : Template({
    uuid = "8fa43427-3d8d-4ae9-83fb-8f54279b3a32"
    id = "JavaScriptProject_Template"
    name = "BaseTemplate"

    params {
        param("Browser", "PhantomJS")
        param("NameOfBuild", "5")
    }

    vcs {
        root(JavaScriptProject.vcsRoots.JavaScriptProject_HttpsGithubComG0t4teamcityCourseCardsGit)

    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_7"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_1"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false"
        }
        stepsOrder = arrayListOf("RUNNER_7", "RUNNER_1")
    }
})
