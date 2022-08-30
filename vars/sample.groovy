def call() {

pipeline {
    agent any
        stages {
            stage ('Lint Check') {
                steps {
                    sh "echo Lint Check running"
                }
            }
        }
    }
}