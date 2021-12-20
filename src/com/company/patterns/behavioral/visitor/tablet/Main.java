package com.company.patterns.behavioral.visitor.tablet;

public class Main {
    public static void main(String[] args) {
        IPad iPad = new IPad("Ipad mini", "Apple");
        GalaxyTab galaxyTab = new GalaxyTab("GalaxyTab", "Samsung");
        iPad.accept(new WifiVisitor());
        galaxyTab.accept(new WifiVisitor());
        iPad.accept(new ThreeGVisitor());
        galaxyTab.accept(new ThreeGVisitor());
    }
}
