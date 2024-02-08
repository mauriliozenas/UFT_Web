pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code repository
                git 'https://github.com/mauriliozenas/UFT_Web'
            }
        }
        stage('Build') {
            steps {
                // Execute ações de build (se necessário)
            }
        }
        stage('Test') {
            steps {
                // Execute o teste UFT One
                bat '"C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\OpenText\\OpenText UFT One\\Tools\\UFTBatchRunner.exe" -testpath "C://Users//maurilio.santos//OneDrive - NEORIS//Área de Trabalho//Cenarios-de-tests"'
            }
        }
    }
}