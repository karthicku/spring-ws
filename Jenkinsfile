properties(
    [
        [
            $class: 'BuildDiscarderProperty',
            strategy: [$class: 'LogRotator', numToKeepStr: '10']
        ],
        pipelineTriggers([cron('H/30 * * * *')]),
    ]
)
node{ 
stage('Checkout from GitHub') {
    // No special needs here, if your projects relys on submodules the checkout step would need to be different
    checkout scm
    echo "checkout"
  }
    stage('Build') {
    // No special needs here, if your projects relys on submodules the checkout step would need to be different

    echo "checkout1"
  }
}

node{
stage 'checkout'
def grV = load "groovy_func.groovy"
checkout changelog: false, poll: false, scm: [$class: 'GitSCM', 
            extensions: [[$class: 'LocalBranch', localBranch: 'master']],
            userRemoteConfigs: []
           env.MAVEN_OPTS = "-XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Xmx1024m -XX:MaxPermSize=512m"   

                  def mvnHome =tool 'Maven'
                  grV.invokeMethod("Job1")
                 // sh "'${mvnHome}/bin/mvn' -T 1C clean install -Dresume=false -DuseReleaseProfile=false  release:prepare release:perform"

def deployments = [:]
deployments["dev"] =
{  
echo 'deployOnDev'
             sh "'${mvnHome}/bin/mvn' -T 1C clean install" }

deployments["uat"] =
{ 
echo 'deployOnUat'
            sh "'${mvnHome}/bin/mvn' -Dresume=false -DuseReleaseProfile=false  release:prepare"
        sh "'${mvnHome}/bin/mvn' release:perform"
    
}
//parallel deployments

}
  //   build job: 'Test'
