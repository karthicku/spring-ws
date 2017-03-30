node{
stage 'checkout'
def grV = load "groovy_func.groovy"
checkout scm
env.MAVEN_OPTS = "-XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Xmx1024m -XX:MaxPermSize=512m"   
      grV.buildGoal("Job1")
      grV.releaseMethod("Job1")
}
                 // sh "'${mvnHome}/bin/mvn' -T 1C clean install -Dresume=false -DuseReleaseProfile=false  release:prepare release:perform"

//def deployments = [:]
//    node{ 
//stage('Checkout from GitHub') {
    // No special needs here, if your projects relys on submodules the checkout step would need to be different
 //   checkout scm
 //   echo "checkout"
 // }
 //   stage('Build') {
    // No special needs here, if your projects relys on submodules the checkout step would need to be different

//    echo "checkout1"
  //}
//}
//deployments["dev"] =
//{  
//echo 'deployOnDev'
//             sh "'${mvnHome}/bin/mvn' -T 1C clean install" }

//deployments["uat"] =
//{ 
//echo 'deployOnUat'
//            sh "'${mvnHome}/bin/mvn' -Dresume=false -DuseReleaseProfile=false  release:prepare"
//        sh "'${mvnHome}/bin/mvn' release:perform"
//    
//}
//parallel deployments

//}
  //   build job: 'Test'
