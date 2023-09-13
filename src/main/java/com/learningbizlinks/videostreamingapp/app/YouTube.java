package com.learningbizlinks.videostreamingapp.app;

public class YouTube implements StreamingApp {
    @Override
    public void login() {
        System.out.println("YouTube esta inciando sesión");
    }

    @Override
    public void searchContent() {
        System.out.println("YouTube esta buscando contenido");
    }

    @Override
    public void playContent() {
        System.out.println("YouTube esta reproduciendo el contenido");
    }

    @Override
    public void pauseContent() {
        System.out.println("YouTube ha pausado el contenido");
    }

    @Override
    public void stopContent() {
        System.out.println("YouTube ha detenido el contenido");
    }

    @Override
    public void forwardContent() {
        System.out.println("YouTube ha adelantado el contenido");
    }

    @Override
    public void rewindContent() {
        System.out.println("YouTube ha retrocedido el contenido");
    }

    @Override
    public void changeQuality() {
        System.out.println("YouTube ha cambiado la calidad del contenido");
    }

    @Override
    public void enableSubtitles() {
        System.out.println("YouTube ha activado los subtitulos del contenido");
    }

    @Override
    public void disableSubtitles() {
        System.out.println("YouTube ha desactivado los subtitulos del contenido");
    }
}
