package com.company.ocp.main;

import com.company.ocp.item.CDPlayer;
import com.company.ocp.item.Radio;
import com.company.ocp.RemoteControl;
import com.company.ocp.item.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();
        CDPlayer cdPlayer = new CDPlayer();

        RemoteControl tvControl = new RemoteControl(tv);
        RemoteControl radioControl = new RemoteControl(radio);
        RemoteControl cdPlayerControl = new RemoteControl(cdPlayer);

        tvControl.on();
        tvControl.off();

        radioControl.on();
        radioControl.off();

        cdPlayerControl.on();
        cdPlayerControl.off();

    }

}
