def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Building..."
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Building Finished!"
}
