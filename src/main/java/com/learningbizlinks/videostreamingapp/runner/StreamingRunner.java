package com.learningbizlinks.videostreamingapp.runner;

import com.learningbizlinks.videostreamingapp.app.StreamingApp;

public class StreamingRunner {
    private StreamingApp streamingApp;

    public StreamingRunner(StreamingApp streamingApp) {this.streamingApp = streamingApp;}

    public void run(){
        System.out.println("Running Streaming App : " + streamingApp);

        streamingApp.login();
        streamingApp.searchContent();
        streamingApp.playContent();
        streamingApp.pauseContent();
        streamingApp.stopContent();
        streamingApp.forwardContent();
        streamingApp.rewindContent();
        streamingApp.changeQuality();
        streamingApp.enableSubtitles();
        streamingApp.disableSubtitles();
    }
}
