def call(String Project, String ImageTag, String dockerhubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerHubuser} -p ${dockerHubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
