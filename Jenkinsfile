#!groovy
pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
    }

    def movieImage

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
            }
            script {
                movieImage =  docker.build("movies:${env.BUILD_ID}")
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}