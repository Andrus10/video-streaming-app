package com.learningbizlinks.videostreamingapp.app;

import org.springframework.stereotype.Component;

@Component
public class Netflix implements StreamingApp {
    @Override
    public void login() {
        System.out.println("Netflix esta inciando sesión");
    }

    @Override
    public void searchContent() {
        System.out.println("Netflix esta buscando contenido");
    }

    @Override
    public void playContent() {
        System.out.println("Netflix esta reproduciendo el contenido");
    }

    @Override
    public void pauseContent() {
        System.out.println("Netflix ha pausado el contenido");
    }

    @Override
    public void stopContent() {
        System.out.println("Netflix ha detenido el contenido");
    }

    @Override
    public void forwardContent() {
        System.out.println("Netflix ha adelantado el contenido");
    }

    @Override
    public void rewindContent() {
        System.out.println("Netflix ha retrocedido el contenido");
    }

    @Override
    public void changeQuality() {
        System.out.println("Netflix ha cambiado la calidad del contenido");
    }

    @Override
    public void enableSubtitles() {
        System.out.println("Netflix ha activado los subtitulos del contenido");
    }

    @Override
    public void disableSubtitles() {
        System.out.println("Netflix ha desactivado los subtitulos del contenido");
    }
}
