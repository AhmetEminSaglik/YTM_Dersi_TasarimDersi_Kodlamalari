package com.company.patterns.creational.abstractfactory.database.main;

import com.company.patterns.creational.abstractfactory.database.command.Command;
import com.company.patterns.creational.abstractfactory.database.connection.Connection;
import com.company.patterns.creational.abstractfactory.database.factory.DBFactory;
import com.company.patterns.creational.abstractfactory.database.factory.MYSQLFactory;
import com.company.patterns.creational.abstractfactory.database.factory.OracleFactory;
import com.company.patterns.creational.abstractfactory.database.factory.SQLFactory;
import com.company.patterns.creational.abstractfactory.database.util.FactoryUtil;

public class Client {
    public static void main(String[] args) {

        String factoryPathName;

        factoryPathName = getPath(SQLFactory.class);

        DBFactory dbFactory = FactoryUtil.getFactory(factoryPathName);
        Connection connection = dbFactory.createConnection();
        connection.connect();

        Command command = dbFactory.createCommand();
        command.setQuery("SELECT * FROM Tablo");
        command.execute();


        factoryPathName = getPath(OracleFactory.class);
        dbFactory = FactoryUtil.getFactory(factoryPathName);
        connection = dbFactory.createConnection();
        connection.connect();
        command = dbFactory.createCommand();
        command.setQuery("SELECT * FROM Tablo");
        command.execute();

        factoryPathName = getPath(MYSQLFactory.class);
        dbFactory = FactoryUtil.getFactory(factoryPathName);
        connection = dbFactory.createConnection();
        connection.connect();
        command = dbFactory.createCommand();
        command.setQuery("SELECT * FROM Tablo");
        command.execute();


    }

    static String getPath(Class dbFactoryClass) {
        return dbFactoryClass.getName();
    }
}
