package com.learningbizlinks.videostreamingapp.app;

public interface StreamingApp {
    // Método para iniciar sesión
    void login();

    // Método para buscar contenido
    void searchContent();

    // Método para reproducir contenido
    void playContent();

    // Método para pausar contenido
    void pauseContent();

    // Método para detener contenido
    void stopContent();

    // Método para adelantar contenido
    void forwardContent();

    // Método para retroceder contenido
    void rewindContent();

    // Método para cambiar la calidad del streaming
    void changeQuality();

    // Método para activar subtítulos
    void enableSubtitles();

    // Método para desactivar subtítulos
    void disableSubtitles();
}
