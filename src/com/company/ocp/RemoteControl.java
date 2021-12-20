package com.company.ocp;

public class RemoteControl {
    private RemoteControlInterface remoteControlInterface;

    public RemoteControl(RemoteControlInterface remoteControlInterface) {
        this.remoteControlInterface = remoteControlInterface;
    }

    public void on() {
        remoteControlInterface.on();
    }

    public void off() {
        remoteControlInterface.off();
    }
}
