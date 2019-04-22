@Library('sample_lib')_

node {
    stage('gitClone'){
        try{
            gitClone 'https://github.com/Costich88/calc'
        }catch (Exception e) {
            echo 'Already pulled'
        }
    }
    stage('build'){
        build()
    }
    stage('test'){
        test()
    }
    stage('archiveArtifacts'){
        archiveArtifacts()
    }
    stage('deployArtifactory'){
        try{
            deployArtifactory('admin','admin123')
        }catch (Exception e) {
            echo 'Deploy failed'
        }
    }
}