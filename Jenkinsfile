def dockeruser = "dspaa1"
def imagename = "calculator-hello-world"
def container = "hello_world_app"
node {
   echo 'Building Calculator-Hello-World Docker Image'

stage('Git Checkout') {
    git 'https://github.com/dspaa1-iscteiul/ES2-2020-EIC1-03-P1.git'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
    
stage('Stop Existing Container'){
   powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
   powershell "docker rm ${container}"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run --name ${container} ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/calculator_hello_world"
    }
}
