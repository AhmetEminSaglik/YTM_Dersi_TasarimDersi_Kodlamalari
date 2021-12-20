package com.company.patterns.structural.bridge.kargo;

public class PesinOdemeliGonderim implements IKargo {
    @Override
    public void kargoGonder(String gonderen, String alici) {
        System.out.println("Pesin odemeli : odeyen taraf : "+gonderen);
    }
}
