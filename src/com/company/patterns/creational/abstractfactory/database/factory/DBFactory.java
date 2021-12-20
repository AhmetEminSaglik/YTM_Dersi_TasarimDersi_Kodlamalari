package com.company.patterns.creational.abstractfactory.database.factory;

import com.company.patterns.creational.abstractfactory.database.command.Command;
import com.company.patterns.creational.abstractfactory.database.connection.Connection;

public abstract class DBFactory {

    public abstract Connection createConnection();

    public abstract Command createCommand();


}
