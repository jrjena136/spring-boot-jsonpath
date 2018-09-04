pipeline {
    stages {
        stage('Build') { 
            steps {
               echo 'build stage'
		git url: 'https://github.com/jrjena136/spring-boot-jsonpath'
		sh 'mvn -B -DskipTests clean package war:war'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploying code' 
            }
        }
    }
}
