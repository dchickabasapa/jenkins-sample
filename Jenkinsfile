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

  }
}
