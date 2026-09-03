@Library('my-shared-library')_

pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {

        stage('Hello'){
            steps{
                sayHello('Thushar')
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([
                    string(credentialsId: 'vercel-token', variable: 'VERCEL_TOKEN')
                ]) {
                    bat 'vercel --prod --token %VERCEL_TOKEN% --yes web'
                }
            }
        }

    }
}
