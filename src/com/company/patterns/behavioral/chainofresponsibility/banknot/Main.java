package com.company.patterns.behavioral.chainofresponsibility.banknot;

import com.company.patterns.behavioral.chainofresponsibility.banknot.paralar.*;

public class Main {
    public static void main(String[] args) {
        Bankamatik bankamatik = new Bankamatik();
        bankamatik.paracek(1385);
    }
}
