#!/usr/bin/env groovy

def call(String username, String password,) {
     sh script: "curl -u ${username}:${password} -T artifacts.zip http://artifactory:8081/artifactory/generic-local/artifacts.zip", returnStdout: true
}