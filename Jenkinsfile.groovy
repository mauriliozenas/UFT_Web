
pipeline {
    agent any
    
    environment {
        UFT_HOME = 'C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\OpenText\\OpenText UFT One\\Tools'
        UFT_TEST = 'C:\\Users\\maurilio.santos\\OneDrive - NEORIS\\Área de Trabalho\\Cenarios-de-tests\\ValidarCompraFlight'
    }
    
    stages {
        stage('Preparar Ambiente') {
            steps {
                bat "C:\\Program Files (x86)\\OpenText\\UFT One\\bin\\" -run "C:\\Users\\maurilio.santos\\OneDrive - NEORIS\\Área de Trabalho\\ResultadosUFT"
            }
        }
    }
}
