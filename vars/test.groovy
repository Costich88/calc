#!/usr/bin/env groovy

def call(body) {
     sh script: "make", returnStdout: true
}