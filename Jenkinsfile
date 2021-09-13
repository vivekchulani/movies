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
                sh "pwd"
            }
            agent {
                dockerfile {
                    filename 'Dockerfile'
                }
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}