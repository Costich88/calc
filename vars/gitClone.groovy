#!/usr/bin/env groovy

def call(String url) {
     out = sh script: 'git clone ${url}', returnStdout: true
    return out
}