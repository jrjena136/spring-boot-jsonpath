pipeline {
   agent any
   tools{
	maven 'M3'
   }
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		sh "mvn clean dependency:tree -Dincludes=com.fasterxml.jackson.core install package war:war"
	   }
	}
        stage('Deploy Stage') { 
            steps {
                echo 'deploying code' 
		sh "mvn tomcat7:deploy"
            }
        }
    }
}
