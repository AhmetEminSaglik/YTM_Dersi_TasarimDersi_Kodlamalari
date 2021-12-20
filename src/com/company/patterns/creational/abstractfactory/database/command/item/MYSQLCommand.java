package com.company.patterns.creational.abstractfactory.database.command.item;

import com.company.patterns.creational.abstractfactory.database.command.Command;

public class MYSQLCommand extends Command {
    @Override
    public void execute() {
        System.out.println("MYSQL Command Calisti");
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    @Override
    public void setQuery(String query) {
        this.query = query;

    }
}
