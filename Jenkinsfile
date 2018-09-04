pipeline {
   agent any
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		git url: 'https://github.com/jrjena136/spring-boot-jsonpath'
		    withMaven(maven:'Maven_3_5_4'){
		    	sh 'mvn clean compile'
		    }
	   }
        stage('Deploy') { 
            steps {
                echo 'deploying code' 
		    withMaven(maven:'Maven_3_5_4'){
		    	sh 'mvn deploy'
		    }
            }
        }
    }
}
