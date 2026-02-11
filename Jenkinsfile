pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Code checked out'
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven Tests'
                bat 'mvn clean test'
            }
        }

    }

    post {
        always {
            echo 'Pipeline finished'
        }
        success {
            echo 'Tests passed successfully'
        }
        failure {
            echo 'Tests failed'
        }
    }
}
