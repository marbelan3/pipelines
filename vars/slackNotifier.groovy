#!/usr/bin/env groovy

def call() {
    slackSend channel: '#tests-ui-tests-api',
            color: '#warning',
            message: "The pipeline ${currentBuild.fullDisplayName} completed successfully!!!!"
}