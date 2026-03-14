pipeline {
    agent any

    environment {
        SONAR_HOST_URL = "http://43.205.194.232:9000"
    }

    stages {

        stage('Build Project') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                sh """
                mvn sonar:sonar \
                -Dsonar.projectKey=sonar-demo \
                -Dsonar.host.url=http://43.205.194.232:9000 \
                -Dsonar.login=admin
                """
            }
        }

    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
