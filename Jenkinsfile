pipeline {
    agent any

        // Build Stage
        stage('Build') {
            steps {
                // Add your build commands here (e.g., mvn clean install, npm install, etc.)
                sh 'mvn clean' // Example using Maven
            }
        }

        // Run Tests Stage
        stage('Run Tests') {
            steps {
                // Shell command or script to execute your automation tests
                sh 'mvn test'
            }
        }

    stage('Compile') {
      steps{
          echo "Compiling the project"
       sh 'mvn compile'
            }
    }

        // Deployment Stage (Optional)
        stage('Deploy') {
          steps{
          echo "Deploying the project"
            }
        }
    }
}
