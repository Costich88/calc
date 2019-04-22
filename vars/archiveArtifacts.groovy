#!/usr/bin/env groovy

def call(body) {
     sh script: "zip -r artifacts.zip .", returnStdout: true
}