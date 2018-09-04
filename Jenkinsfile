pipeline {
    agent any 
     tools{
	maven 'Maven_3.5.2'
     }
    stages {
        stage('Build') { 
            steps {
               echo 'build stage'
		git url: 'https://github.com/jrjena136/spring-boot-jsonpath'
		sh "mvn clean install package war:war"
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploying code' 
            }
        }
    }
}
