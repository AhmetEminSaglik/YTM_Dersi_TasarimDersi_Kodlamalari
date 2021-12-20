package com.company.patterns.structural.bridge.database;

public abstract class DbAbstraction {
    protected  DbImplementor implementor;

    public DbAbstraction(DbImplementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(DbImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract  void execute(String sql);
    public abstract  void conOpen(String conStr);

}
