#!/usr/bin/env groovy

pipeline {

  agent any

  stages {
    stage('Setup') {
      steps {
        echo 'Running steps to setup the build machine'
        sh 'docker rmi vmware-docker-skyscraper-docker.io/jenkinssample:latest 2>&1'
    }
    stage('Build') {
      steps {
        echo 'Building'
        sh 'cd jenkins-sample && ./gradlew build'
      }
    }
    stage('Build-DockerImage') {
      steps {
        echo 'Building Docker Images'
        sh 'cd jenkins-sample && docker build -t vmware-docker-skyscraper-docker.bintray.io/jenkinssample:latest .'
      }
    }
    stage('DockerImage-Push') {
      steps {
        echo 'Pushing Docker image to Bintray'
        sh 'docker push vmware-docker-skyscraper-docker.bintray.io/jenkinssample:latest'
      }
    }
  }
}
