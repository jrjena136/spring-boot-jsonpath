pipeline {
   agent any
   tools{
	maven 'M3'
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
