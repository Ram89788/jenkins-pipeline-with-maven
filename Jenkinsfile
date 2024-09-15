
pipeline {
    agent any
    environment {
        PATH = "/usr/share/man/man1/mvn.1.gz:$PATH"
    }
    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/Ram89788/jenkins-pipeline-with-maven.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
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
