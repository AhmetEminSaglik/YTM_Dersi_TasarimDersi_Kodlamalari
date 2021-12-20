package com.company.patterns.creational.abstractfactory.database.command.item;

import com.company.patterns.creational.abstractfactory.database.command.Command;

public class OracleCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Oracle Command calisti");
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
