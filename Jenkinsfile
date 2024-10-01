
pipeline {
    agent any
    environment {
        PATH = "/usr/share/maven:$PATH"
    }
    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/Ram89788/jenkins-pipeline-with-maven.git', branch: 'main'
            }
        }
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
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
