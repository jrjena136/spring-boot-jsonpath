pipeline {
   agent any
   tools{
	mvn 'Maven_3_3_9'
   }
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		sh "mvn clean verify install package"
	   }
	}
        stage('Deploy Stage') { 
            steps {
                echo 'deploying code' 
		sh "mvn deploy"
            }
        }
    }
}
