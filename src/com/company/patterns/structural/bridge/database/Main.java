package com.company.patterns.structural.bridge.database;

public class Main {
    public static void main(String[] args) {
        DbAbstraction absDb = new DbRefinedAbstraction(new SqlServerImplementor());
        absDb.conOpen("e-ticaret db");
        absDb.execute("select * from Urun");
        absDb = new DbRefinedAbstraction(new OracleImplementor());
        absDb.conOpen("e-ticaret db");
        absDb.execute("select * from Urun");
        
    }
}
