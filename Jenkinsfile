def dockeruser = "dspaa1"
def imagename = "calculator-hello-world"
def container = "hello_world_app"
node {
   echo 'Building Calculator-Hello-World Docker Image'

stage('Git Checkout') {
    git 'https://github.com/dspaa1-iscteiul/ES2-2020-EIC1-03-P1.git'
    }
   
stage('Maven Package') {
   steps {
        sh 'mvn -B -DskipTests clean package'
         }
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
    powershell "docker run -dit --name ${container} -p 80:80 ${imagename}"
    }
    
stage('Tag Docker Image'){
    powershell "docker tag ${imagename} ${env.dockeruser}/Calculator_Hello_World"
    }

stage('Docker Login and Push Image'){
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerpasswd', usernameVariable: 'dockeruser')]) {
    powershell "docker login -u ${dockeruser} -p ${dockerpasswd}"
    }
    powershell "docker push ${dockeruser}/ubuntu:16.04"
    }

}
