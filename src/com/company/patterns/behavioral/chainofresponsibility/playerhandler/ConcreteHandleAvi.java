package com.company.patterns.behavioral.chainofresponsibility.playerhandler;

public class ConcreteHandleAvi extends PlayerHandler {
    @Override
    public void play(String filePath) {
        if (filePath.endsWith(".avi"))
            System.out.println(filePath + " dosyasi (avi player) oynatiliyor.");
        else {
            if (sonrakiHandler != null) {
                System.out.println("Gecersiz Dosya Formati " + filePath);
            }
        }

    }
}
