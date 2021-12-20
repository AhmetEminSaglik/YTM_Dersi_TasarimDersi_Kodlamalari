package com.company.patterns.structural.bridge.database;

public class OracleImplementor extends DbImplementor {
    @Override
    public void execute(String sql) {
        System.out.println("Oracle Server isletildi : " + sql);
    }

    @Override
    public void openCon(String sqlCon) {
        System.out.println("Oracle connection acildi : " + sqlCon);
    }
}
