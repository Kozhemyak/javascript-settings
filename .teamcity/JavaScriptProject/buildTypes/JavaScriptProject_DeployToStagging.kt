package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_DeployToStagging : BuildType({
    uuid = "f328c924-570c-4f34-999f-ac9be2a0c268"
    id = "JavaScriptProject_DeployToStagging"
    name = "03. Deploy To Stagging"

    vcs {
        root(JavaScriptProject.vcsRoots.JavaScriptProject_HttpsGithubComG0t4teamcityCourseCardsGit)

    }
    
    steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_1"
            scriptContent = """
                rmdir /S /Q c:\inetpub\wwwroot
                xcopy /S /I /Y app c:\inetpub\wwwroot\
            """
        }
    }

    dependencies {
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_Chrome) {
            snapshot {
            }
        }
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_Firefox) {
            snapshot {
            }
        }
    }
})
