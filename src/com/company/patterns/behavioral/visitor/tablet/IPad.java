package com.company.patterns.behavioral.visitor.tablet;

public class IPad extends Tablet {
    public IPad(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


}
