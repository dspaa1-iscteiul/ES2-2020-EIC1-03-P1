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
   powershell "docker ps -a -q --filter name=hello_world_app | FindStr -q . if(\$?) { docker stop hello_world_app }"
    }
    
stage('Remove Existing Container'){
   powershell "docker ps -a -q --filter name=hello_world_app | FindStr -q . if(\$?) { docker rm hello_world_app }"
    }
    
stage ('Runing Container to test built Docker Image'){
    powershell "docker run --name ${container} ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/calculator_hello_world"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/calculator_hello_world"
    }

}
