def call() {

 pipeline {
  agent {
    label 'agent'
    }
  stages {
    stage('compile') {
      steps {
        script{
	   common.compile()
	}
      }
    }
    stage('unit test'){
      steps {
       script{
           common.test()
        }

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
