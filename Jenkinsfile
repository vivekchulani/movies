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
                sh "pwd"
                sh "mvn clean install"
                echo "$WORKSPACE"
            }
        }

        stage('Build Docker Image') {
            agent { dockerfile true }
            steps {
                sh 'pwd'
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}