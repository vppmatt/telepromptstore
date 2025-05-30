def GIT_URL = "https://github.com/vppmatt/telepromptstore.git"

pipeline {
    agent any
    options {
        timeout(time: 300, unit: "SECONDS")
    }
    stages {

        stage('GetFromGithub') {
            steps {
                git branch: 'main', url: GIT_URL
            }
        }

        stage("Build jar file") {
            steps {
                script {
                    sh "chmod a+x mvnw"
                    sh "./mvnw clean package"
                }
            }
        }

        stage("CreateDockerImage") {
            steps {
                script {
                    sh "docker build -t teleprompterstore:latest ."
                }
            }
        }



    }
}