pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      steps {
        echo 'Starting Build Process'
        sh 'mvn clean install'
        echo 'Build Step Complete'
      }
    }

    stage('Javadoc') {
      agent any
      steps {
        echo 'Start Javadoc Generation'
        sh 'mvn javadoc:javadoc'
        echo 'Javadoc generation complete'
      }
    }

    stage('Testing') {
      agent any
      steps {
        echo 'Start Testing Process'
        sh 'mvn test'
        echo 'Testing process complete'
      }
    }

  }
}