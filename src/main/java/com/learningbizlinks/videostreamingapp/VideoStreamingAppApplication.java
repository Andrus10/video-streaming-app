package com.learningbizlinks.videostreamingapp;

import com.learningbizlinks.videostreamingapp.app.Disney;
import com.learningbizlinks.videostreamingapp.app.HBO;
import com.learningbizlinks.videostreamingapp.app.Netflix;
import com.learningbizlinks.videostreamingapp.app.YouTube;
import com.learningbizlinks.videostreamingapp.runner.StreamingRunner;

public class VideoStreamingAppApplication {

	public static void main(String[] args) {
		Disney disney = new Disney();
		HBO hbo = new HBO();
		Netflix netflix = new Netflix();
		YouTube youTube = new YouTube();

		System.out.println("Disney Plus");
		StreamingRunner streamingDisney = new StreamingRunner(disney);
		streamingDisney.run();

		System.out.println("HBO Max");
		StreamingRunner streamingHbo = new StreamingRunner(hbo);
		streamingHbo.run();

		System.out.println("Netflix");
		StreamingRunner streamingNetflix = new StreamingRunner(netflix);
		streamingNetflix.run();

		System.out.println("YouTube TV");
		StreamingRunner streamingYoutube = new StreamingRunner(youTube);
		streamingYoutube.run();
	}

}
