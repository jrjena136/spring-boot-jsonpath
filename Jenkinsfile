pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
               echo 'build stage'
		git url: 'https://github.com/jrjena136/spring-boot-jsonpath'
		withMaven(
        	// Maven installation declared in the Jenkins "Global Tool Configuration"
        	maven: 'M3',
        	// Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        	// Maven settings and global settings can also be defined in Jenkins Global Tools 			//Configuration
        	mavenSettingsConfig: 'my-maven-settings',
        	mavenLocalRepo: '.repository')
		{
			sh "mvn clean install package war:war"
		}
            }
        }
        //stage('Test') { 
          //  steps {
            //   echo 'Testing code' 
            //}
       // }
        stage('Deploy') { 
            steps {
                echo 'deploying code' 
            }
        }
    }
}
