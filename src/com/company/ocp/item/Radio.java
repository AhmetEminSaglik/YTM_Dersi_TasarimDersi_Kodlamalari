package com.company.ocp.item;

import com.company.ocp.RemoteControlInterface;

public class Radio implements RemoteControlInterface {

    public void onRadio() {
        System.out.println(getClass().getSimpleName() + " is opened");
    }

    public void offRadio() {
        System.out.println(getClass().getSimpleName() + " is closed");
    }

    @Override
    public void on() {
        onRadio();
    }

    @Override
    public void off() {
        offRadio();
    }
}
