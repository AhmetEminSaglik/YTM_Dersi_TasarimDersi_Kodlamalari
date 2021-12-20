package com.company.patterns.behavioral.visitor.tablet;

public abstract class Tablet {
    public String model, brand;

    public Tablet(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public abstract void accept(IVisitor visitor);

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
