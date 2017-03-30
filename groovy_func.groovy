echo 'hello'
properties(
    [
        [
            $class: 'BuildDiscarderProperty',
            strategy: [$class: 'LogRotator', numToKeepStr: '10']
        ],
        pipelineTriggers([cron('H/30 * * * *')]),
    ]
)
//Add maven build goals
def buildGoal(String name) {
        echo "Invoke method $name"
        def mvnHome =tool 'Maven'
         sh "'${mvnHome}/bin/mvn' -T 1C clean install"
    }
//Add maven release goals
def releaseMethod(String name) {
        def mvnHome =tool 'Maven'
        sh "'${mvnHome}/bin/mvn' -Dresume=false -DuseReleaseProfile=false  release:prepare"
    }

return this
