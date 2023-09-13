package com.learningbizlinks.videostreamingapp.app;

public class HBO implements StreamingApp {
    @Override
    public void login() {
        System.out.println("HBO esta inciando sesión");
    }

    @Override
    public void searchContent() {
        System.out.println("HBO esta buscando contenido");
    }

    @Override
    public void playContent() {
        System.out.println("HBO esta reproduciendo el contenido");
    }

    @Override
    public void pauseContent() {
        System.out.println("HBO ha pausado el contenido");
    }

    @Override
    public void stopContent() {
        System.out.println("HBO ha detenido el contenido");
    }

    @Override
    public void forwardContent() {
        System.out.println("HBO ha adelantado el contenido");
    }

    @Override
    public void rewindContent() {
        System.out.println("HBO ha retrocedido el contenido");
    }

    @Override
    public void changeQuality() {
        System.out.println("HBO ha cambiado la calidad del contenido");
    }

    @Override
    public void enableSubtitles() {
        System.out.println("HBO ha activado los subtitulos del contenido");
    }

    @Override
    public void disableSubtitles() {
        System.out.println("HBO ha desactivado los subtitulos del contenido");
    }
}
