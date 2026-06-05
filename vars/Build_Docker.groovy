def Build_Docker(String Dockerfile){
  echo "Building..."
  sh "docker build -t ${Dockerfile} ."
  echo "Building Finished!"
}
