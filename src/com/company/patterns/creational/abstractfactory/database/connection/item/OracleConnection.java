package com.company.patterns.creational.abstractfactory.database.connection.item;

import com.company.patterns.creational.abstractfactory.database.connection.Connection;

public class OracleConnection extends Connection {
    @Override
    public void connect() {
        System.out.println("Oracle'a baglandi");
    }

    @Override
    public String getConnectionString() {
        return this.connectionString;
    }

    @Override
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }


}
