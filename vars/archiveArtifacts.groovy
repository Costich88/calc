#!/usr/bin/env groovy

def call() {
     sh script: "zip -r artifacts.zip .", returnStdout: true
}