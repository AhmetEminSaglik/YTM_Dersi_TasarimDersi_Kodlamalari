package com.company.patterns.creational.abstractfactory.database.factory;

import com.company.patterns.creational.abstractfactory.database.command.Command;
import com.company.patterns.creational.abstractfactory.database.command.item.OracleCommand;
import com.company.patterns.creational.abstractfactory.database.connection.Connection;
import com.company.patterns.creational.abstractfactory.database.connection.item.OracleConnection;

public class OracleFactory extends DBFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
}
