#!/usr/bin/env groovy

def call() {
    slackSend channel: '#tests-ui-tests-api',
            color: '#BADA55',
            message: "The pipeline ${currentBuild.fullDisplayName} completed successfully!!!!"
}