pipeline {
   agent any
	
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		withMaven(maven:'Maven_3_5_4'){
		    sh 'mvn clean compile'
		 }
	   }
	}
        stage('Deploy Stage') { 
            steps {
                echo 'deploying code' 
		 withMaven(maven:'Maven_3_5_4'){
		    sh 'mvn deploy'
		 }
            }
        }
    }
}
