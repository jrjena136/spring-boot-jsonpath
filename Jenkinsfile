pipeline {
   agent any
	
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		def mvn_version = 'Maven_3_3_9'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  		  sh "mvn clean verify install package"
		}
	   }
	}
        stage('Deploy Stage') { 
            steps {
                echo 'deploying code' 
		 def mvn_version = 'Maven_3_3_9'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  		  sh "mvn deploy"
		}
            }
        }
    }
}
