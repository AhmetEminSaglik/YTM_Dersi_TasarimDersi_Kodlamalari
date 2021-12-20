package com.company.patterns.creational.abstractfactory.database.factory;

import com.company.patterns.creational.abstractfactory.database.command.Command;
import com.company.patterns.creational.abstractfactory.database.command.item.SQLCommand;
import com.company.patterns.creational.abstractfactory.database.connection.Connection;
import com.company.patterns.creational.abstractfactory.database.connection.item.SQLConnection;

public class SQLFactory extends DBFactory {
    @Override
    public Connection createConnection() {
        return new SQLConnection();
    }

    @Override
    public Command createCommand() {
        return new SQLCommand();
    }
}
