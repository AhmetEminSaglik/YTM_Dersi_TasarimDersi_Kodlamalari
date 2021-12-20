package com.company.ocp.item;

import com.company.ocp.RemoteControlInterface;

public class CDPlayer implements RemoteControlInterface {


    public void onCdPlayer() {
        System.out.println(getClass().getSimpleName() + " is opened");
    }

    public void offCdPlayer() {
        System.out.println(getClass().getSimpleName() + " is closed");
    }

    @Override
    public void on() {
        onCdPlayer();
    }

    @Override
    public void off() {
        offCdPlayer();
    }
}
