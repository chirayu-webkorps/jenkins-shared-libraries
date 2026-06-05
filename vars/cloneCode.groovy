def call(String url, String branch){
  echo "MY CLONE CODE FUNCITON IS CALLED"
  git url: url, branch: branch
  echo "Code Clining successfully"
}
