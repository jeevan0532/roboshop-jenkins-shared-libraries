def call() {

 pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        echo 'compile'
      }
    }
    stage('unit test'){
      steps {
        echo 'unit test'
      }
    }
    stage('quality control'){
        steps{
          echo 'quality control'
        }
    }
    stage('upload code to centralised place'){
        steps{
          echo 'upload'
        }
    }
   }
 }

}
