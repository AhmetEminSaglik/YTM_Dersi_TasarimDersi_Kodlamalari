package com.company.patterns.creational.abstractfactory.database.command;

public abstract class Command {
    public abstract void execute();

    protected String query;

    public abstract String getQuery();

    public abstract void setQuery(String query);
}
