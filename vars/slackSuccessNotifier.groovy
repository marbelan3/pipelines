#!/usr/bin/env groovy

def call() {
    slackSend channel: '#tests-ui-tests-api',
            color: '#BADA55',
            message: "The pipeline ${currentBuild.fullDisplayName} completed successfully!!!!"
    def slackResponse = slackSend(channel: "cool-threads", message: "Here is the primary message")
    slackSend(channel: slackResponse.threadId, message: "Thread reply #1")
    slackSend(channel: slackResponse.threadId, message: "Thread reply #2")
}