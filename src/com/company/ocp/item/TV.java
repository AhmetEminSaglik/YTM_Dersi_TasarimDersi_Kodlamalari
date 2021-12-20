package com.company.ocp.item;

import com.company.ocp.RemoteControlInterface;

public class TV implements RemoteControlInterface {


    public void onTv() {
        System.out.println(getClass().getSimpleName()  + " is opened");
    }

    public void offTv() {
        System.out.println(getClass().getSimpleName() + " is closed");
    }

    @Override
    public void on() {
        onTv();
    }

    @Override
    public void off() {
        offTv();
    }
}
