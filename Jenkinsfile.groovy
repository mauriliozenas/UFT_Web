
pipeline {
    agent any
    
    environment {
        UFT_HOME = 'C:\ProgramData\Microsoft\Windows\Start Menu\Programs\OpenText\OpenText UFT One\Tools'
        UFT_TEST = 'C:\Users\maurilio.santos\OneDrive - NEORIS\Área de Trabalho\Cenarios-de-tests'
    }
    
    stages {
        stage('Preparar Ambiente') {
            steps {
                bat "\"${UFT_HOME}\\bin\\uft.bat\" -run -TestPath \"${UFT_TEST}\""
            }
        }
    }
}
