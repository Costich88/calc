#!/usr/bin/env groovy

def call(String url) {
     echo "Hello, ${url}"
     sh script: 'git clone ${url}', returnStdout: true
}