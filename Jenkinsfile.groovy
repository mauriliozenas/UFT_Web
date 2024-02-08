pipeline {
    agent any
    
    stages {
        stage('Run UFT Tests') {
            steps {
                // Comando para executar os testes UFT
                // Por exemplo, você pode chamar o executável do UFT e passar os testes a serem executados
                bat 'C:\Program Files (x86)\OpenText\UFT One\bin\UFT.exe' -test 'C:\Users\maurilio.santos\OneDrive - NEORIS\Área de Trabalho\Cenarios-de-tests\ValidarCompraFlight'
            }
        }
    }
    
    post {
        always {
            // Após a execução dos testes, gerar o arquivo XML de resultados
            script {
                // Aqui você precisa ajustar o caminho e o nome do arquivo de resultado conforme necessário
               def resultFile = 'C:\Users\maurilio.santos\OneDrive - NEORIS\Área de Trabalho\Cenarios-de-tests'
                
                // Gere o arquivo XML com base nos resultados dos testes
                                 
                // Arquivo XML de resultados gerado
               // <echo "Arquivo XML de resultados gerado em ${resultFile}"/>
            }
        }
    }
