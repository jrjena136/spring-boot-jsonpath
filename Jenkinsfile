pipeline {
   agent any
   tools{
	maven 'M3'
   }
    stages {
        stage('Compile Stage') { 
            steps {
               echo 'Compile Stage'
		sh "mvn clean verify install package war:war"
	   }
	}
        stage('Deploy Stage') { 
            steps {
                echo 'deploying code' 
		sh "mvn deploy -DaltDeploymentRepository=internal.repo::default::file:///home/jyoti/repo/org/jyoti/dev/spring-boot-jsonpath/1.0"
            }
        }
    }
}
