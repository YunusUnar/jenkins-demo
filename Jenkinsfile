pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Pulling code from GitHub'
            }
        }

        stage('Build') {
            steps {
                sh 'echo Building Application'
            }
        }

        stage('Test') {
            steps {
                sh 'echo Running Tests'
            }
        }

        stage('Notify') {
            steps {
                echo 'Pipeline Executed Successfully'
            }
        }
    }
}
