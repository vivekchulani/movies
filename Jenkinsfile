#!groovy
pipeline {
    agent any
    tools {
        maven 'Maven 3.3.3'
        jdk 'jdk9'
    }

    stages {
        stage('Build project') {
            steps {
                echo "Building project..."
                echo "M2_HOME = ${M2_HOME}"
                sh "mvn clean install"
            }
        }

        stage('Build Docker Image') {
            steps {
                echo "Building Docker Image..."
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "PushingImage to Artifactory..."
            }
        }
    }
}