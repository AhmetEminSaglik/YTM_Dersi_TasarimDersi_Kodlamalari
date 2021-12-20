package com.company.patterns.structural.bridge.database;

public abstract class DbImplementor {
    public abstract void execute(String sql);

    public abstract void openCon(String sqlCon);
}
