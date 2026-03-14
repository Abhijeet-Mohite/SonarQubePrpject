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
                -Dsonar.projectKey=SonarQubePrpject \
                -Dsonar.host.url=http://43.205.194.232:9000 \
                -Dsonar.login=squ_8a02ae75a406804fcc38a62b2ec7a8aa89ebb7a5
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
