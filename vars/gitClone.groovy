#!/usr/bin/env groovy

def call(String url) {
     sh script: "git clone ${url} .", returnStdout: true
}