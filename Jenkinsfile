pipeline {
    agent any
    tools {
        maven 'Maven' // Ensure you have Maven configured in Jenkins Global Tool Configuration
    }
    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/Ram89788/jenkins-pipeline-with-maven.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
