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
