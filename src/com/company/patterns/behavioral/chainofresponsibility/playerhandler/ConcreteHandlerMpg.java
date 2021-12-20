package com.company.patterns.behavioral.chainofresponsibility.playerhandler;

public class ConcreteHandlerMpg extends PlayerHandler {
    @Override
    public void play(String filePath) {
        if (filePath.endsWith(".mpg"))
            System.out.println(filePath + " dosyasi (mpg player) oynatiliyor.");
        else {
            if (sonrakiHandler != null) {
                sonrakiHandler.play(filePath);
            }
        }
    }
}
