package com.learningbizlinks.videostreamingapp;

import com.learningbizlinks.videostreamingapp.config.AppConfig;
import com.learningbizlinks.videostreamingapp.runner.StreamingRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VideoStreamingAppApplication {

	public static void main(String[] args) {
		/*Disney disney = new Disney();
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
		streamingYoutube.run();*/

		// Iteración 3
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getBean(StreamingRunner.class).run();
	}
}
