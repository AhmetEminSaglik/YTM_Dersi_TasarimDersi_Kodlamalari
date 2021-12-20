package com.company.patterns.creational.abstractfactory.database.connection;

public abstract class Connection {
    public abstract void connect();

    protected String connectionString;

    public abstract String getConnectionString();

    public abstract void setConnectionString(String connectionString);


}
