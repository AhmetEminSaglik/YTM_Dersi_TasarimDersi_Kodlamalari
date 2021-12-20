package com.company.patterns.creational.abstractfactory.database.factory;

import com.company.patterns.creational.abstractfactory.database.command.Command;
import com.company.patterns.creational.abstractfactory.database.command.item.MYSQLCommand;
import com.company.patterns.creational.abstractfactory.database.connection.Connection;
import com.company.patterns.creational.abstractfactory.database.connection.item.MYSQLConnection;

public class MYSQLFactory extends  DBFactory{
    @Override
    public Connection createConnection() {
        return new MYSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MYSQLCommand();
    }
}
