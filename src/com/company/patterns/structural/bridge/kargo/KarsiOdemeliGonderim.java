package com.company.patterns.structural.bridge.kargo;

public class KarsiOdemeliGonderim implements IKargo {
    @Override
    public void kargoGonder(String gonderen, String alici) {
        System.out.println("Karsi odemeli : odeyen taraf : "+alici);
    }
}
