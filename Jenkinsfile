#!groovy
pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
        docker 'docker'
    }

    stages {
        stage('Build project') {
            steps {
                echo "Building project..."
                sh "mvn clean install"
            }
        }

        stage('Build Docker Image') {
            steps {
                echo "Building Docker Image...."
                sh "docker build -t movies:${env.BUILD_NUMBER} ."
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}