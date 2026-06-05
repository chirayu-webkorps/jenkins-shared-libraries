def call( String ProjectName, String ImageTag ) {
  echo "This is pushing the image to Docker Hub"
                withCredentials([usernamePassword( 
                    credentialsId:"dockerHubCred", 
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser"
                )]){
                    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                    sh "docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}"
                    sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
                }
}
