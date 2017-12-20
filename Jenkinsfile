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
        sh 'cd jenkins-sample && docker build -t vmware-docker-skyscraper-docker.bintray.io/jenkinssample:latest .'
      }
    }
    stage('DockerImage-Push') {
      steps {
        echo 'Pushing Docker image to Bintray'
        sh 'docker push vmware-docker-skyscraper-docker.bintray.io/jenkinssample:latest'
      }
    }
    stage('Application-Deployment') {
      steps {
        marathon(
          url: 'https://dcos-masters-ply2.skyscraper.vmware.com',
          credentialsId : 'DCOS-Creds',
          forceUpdate: true,
          dockerForcePull: true
        )
      }
    }
  }
}
