pipeline {
    agent any
    tools {
        maven 'Maven-3.9' // Make sure the tool name matches Jenkins configuration
    }
    stages {
        stage('Clone Repository') {
            steps {
                // Clone the repository from GitHub
                git url: 'https://github.com/Ram89788/jenkins-pipeline-with-maven.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                // Execute Maven build
                script {
                    try {
                        sh 'mvn clean package'
                    } catch (Exception e) {
                        error("Build failed with error: ${e.message}")
                    }
                }
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
        always {
            echo 'Pipeline finished.'
        }
    }
}
