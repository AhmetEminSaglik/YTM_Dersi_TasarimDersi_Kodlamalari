package com.company.patterns.structural.bridge.database;

public class DbRefinedAbstraction extends DbAbstraction {

    public DbRefinedAbstraction(DbImplementor implementor) {
        super(implementor);
    }

    @Override
    public void execute(String sql) {
        implementor.execute(sql);
    }

    @Override
    public void conOpen(String conStr) {
        implementor.openCon(conStr);

    }
}
