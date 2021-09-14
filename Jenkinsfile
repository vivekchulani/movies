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
                    additionalBuildArgs '-t rppp:$BRANCH_NAME'
                }
            }
            steps {
                sh 'pwd'
            }
        }

    }
}