package com.company.patterns.behavioral.chainofresponsibility.playerhandler;

public class Main {
    public static void main(String[] args) {
        PlayerHandler mp4Player = new ConcreteHandlerMp4();
        PlayerHandler mpgPlayer = new ConcreteHandlerMpg();
        PlayerHandler aviPlayer = new ConcreteHandleAvi();

        mp4Player.sonrakiHandler = mpgPlayer;
        mpgPlayer.sonrakiHandler = aviPlayer;

        mp4Player.play("video.mpg");
        mp4Player.play("video.avi");
        mp4Player.play("video.mp4");
        mp4Player.play("video.swf");


    }
}
