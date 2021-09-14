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
                additionalBuildArgs '--tag movies:$BRANCH_NAME'
                args '-v $WORKSPACE:/project -w /project'
            }
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