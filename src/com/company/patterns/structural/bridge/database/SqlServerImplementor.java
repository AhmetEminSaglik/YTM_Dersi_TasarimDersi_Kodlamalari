package com.company.patterns.structural.bridge.database;

public class SqlServerImplementor extends DbImplementor {
    @Override
    public void execute(String sql) {
        System.out.println("Sql Server isletildi : " + sql);
    }

    @Override
    public void openCon(String sqlCon) {
        System.out.println("Sql connection acildi : " + sqlCon);
    }
}
