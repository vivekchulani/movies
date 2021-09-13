#!groovy
pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
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
                def dockerImage =  docker.build("movies:${env.BUILD_NUMBER}")
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}