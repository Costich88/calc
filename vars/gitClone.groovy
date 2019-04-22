#!/usr/bin/env groovy

def clone(String url) {
     out = sh script: 'git clone ${url}', returnStdout: true
    return out
}