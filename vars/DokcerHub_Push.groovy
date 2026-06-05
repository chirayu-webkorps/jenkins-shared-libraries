def call() {
  echo "This is pushing the image to Docker Hub"
                withCredentials([usernamePassword( 
                    credentialsId:"dockerHubCred", 
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser"
                )]){
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                    sh "docker image tag notes-app:latest chirayuwebkorps/notes-app:latest"
                    sh "docker push ${env.dockerHubUser}/notes-app:latest"
                }
}
