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

        stage('Build Docker Image & Push to Artifactory') {
            agent {
                dockerfile {
                    additionalBuildArgs '--tag rppp:v1'
                }
            }
            steps {
                sh 'pwd'
            }
        }

    }
}