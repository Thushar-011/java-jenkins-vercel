node {

    stage('Build') {
        bat 'mvn clean compile'
    }

    stage('Test') {
        bat 'mvn test'
    }

    stage('Deploy') {
        withCredentials([
                    string(credentialsId: 'vercel-token', variable: 'VERCEL_TOKEN')
                ]) {
                    bat 'vercel --prod --token %VERCEL_TOKEN% --yes web'
        }

    }
}