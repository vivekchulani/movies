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
            }
        }

        stage('Build Docker Image') {
            steps {
                echo "Building Docker Image...."
            }
            agent {
                dockerfile true
            }
            steps {
                sh 'docker version'
                sd 'pwd'
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}