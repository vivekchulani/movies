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
            agent {
                dockerfile {
                    filename 'Dockerfile'
                    args '-v ~/.jenkins/workspace/Movies:/tmp'
                }
            }
            steps {
                echo 'test'
            }
        }

        stage('Push Image to Artifactory') {
            steps {
                echo "Pushing Image to Artifactory..."
            }
        }
    }
}