pipeline {
	agent {
		node {
			label 'master'
		
		}
	
	
	}

	options {
		timestamps()
	}

	
	stages {
		stage("Checkout, Test & Publish"){
			steps{
				checkout scm
				script{
				bat(/mvn clean test/)
				}
			
				step([$class : 'Publisher', reportFilenamePattern : '**/testng-results.xml'])
			}
		}
	}



}