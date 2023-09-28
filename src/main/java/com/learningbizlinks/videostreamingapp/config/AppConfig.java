package com.learningbizlinks.videostreamingapp.config;

import com.learningbizlinks.videostreamingapp.app.*;
import com.learningbizlinks.videostreamingapp.runner.StreamingRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StreamingApp app() {
        return new HBO();
    }

    /*@Bean
    public StreamingApp appDisney() {
        return new Disney();
    }

    @Bean
    public StreamingApp appNetflix() {
        return new Netflix();
    }

    @Bean
    public StreamingApp appYouTube() {
        return new YouTube();
    }*/

    @Bean
    public StreamingRunner appRunner(StreamingApp app) {
        return new StreamingRunner(app);
    }
}
