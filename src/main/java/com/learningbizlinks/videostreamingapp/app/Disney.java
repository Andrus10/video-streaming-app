package com.learningbizlinks.videostreamingapp.app;

public class Disney implements StreamingApp {
    @Override
    public void login() {
        System.out.println("Disney esta inciando sesión");
    }

    @Override
    public void searchContent() {
        System.out.println("Disney esta buscando contenido");
    }

    @Override
    public void playContent() {
        System.out.println("Disney esta reproduciendo el contenido");
    }

    @Override
    public void pauseContent() {
        System.out.println("Disney ha pausado el contenido");
    }

    @Override
    public void stopContent() {
        System.out.println("Disney ha detenido el contenido");
    }

    @Override
    public void forwardContent() {
        System.out.println("Disney ha adelantado el contenido");
    }

    @Override
    public void rewindContent() {
        System.out.println("Disney ha retrocedido el contenido");
    }

    @Override
    public void changeQuality() {
        System.out.println("Disney ha cambiado la calidad del contenido");
    }

    @Override
    public void enableSubtitles() {
        System.out.println("Disney ha activado los subtitulos del contenido");
    }

    @Override
    public void disableSubtitles() {
        System.out.println("Disney ha desactivado los subtitulos del contenido");
    }
}
