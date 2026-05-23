pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    environment {
        IMAGE_NAME = 'calculator-app'
        CONTAINER_NAME = 'calculator-container'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/mdsaad31/cicd-endterm.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Check Docker') {
            steps {
                bat 'docker --version'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker rm -f %CONTAINER_NAME% || exit /b 0'
                bat 'docker run -d --name %CONTAINER_NAME% -p 9090:8080 %IMAGE_NAME%'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs!'
        }
    }
}
