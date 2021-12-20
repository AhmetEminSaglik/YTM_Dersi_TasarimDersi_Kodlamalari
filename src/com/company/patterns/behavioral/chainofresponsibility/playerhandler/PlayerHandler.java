package com.company.patterns.behavioral.chainofresponsibility.playerhandler;

public abstract class PlayerHandler {
    protected PlayerHandler sonrakiHandler;

    public void setSonrakiHandler(PlayerHandler sonrakiHandler) {
        this.sonrakiHandler = sonrakiHandler;
    }

    public abstract void play(String filePath);
}
