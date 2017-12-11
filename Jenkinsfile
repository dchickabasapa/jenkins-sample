#!/usr/bin/env groovy

pipeline {

  agent any

  stages {
  
    stage('Build') {
    
      steps {
        echo 'Building'
        sh 'cd jenkins-sample && ./gradlew build'
      }
    }
    stage('Build-DockerImage') {
      steps {
        echo 'Building Docker Images'
        sh 'cd jenkins-sample && docker build -t jenkins-sample:latest .'
      }
    }

  }
}
