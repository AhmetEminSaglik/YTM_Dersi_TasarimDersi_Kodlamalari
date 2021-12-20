package com.company.patterns.behavioral.chainofresponsibility.playerhandler;

public class ConcreteHandlerMp4 extends PlayerHandler {
    @Override
    public void play(String filePath) {
        if (filePath.endsWith(".mp4"))
            System.out.println(filePath + " dosyasi (mp4 player) oynatiliyor.");
        else {
            if (sonrakiHandler != null) {

                sonrakiHandler.play(filePath);
            }
        }
    }
}
