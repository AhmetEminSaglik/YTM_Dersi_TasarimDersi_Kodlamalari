package com.company.patterns.creational.abstractfactory.database.util;

import com.company.patterns.creational.abstractfactory.database.factory.DBFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryUtil {
    public static DBFactory getFactory(String factoryWholeName) {

        try {
            Class clazz = Class.forName(factoryWholeName);
            Constructor<?> ctor = clazz.getConstructor(/*String.class*/);
            Object obj = ctor.newInstance();
//            ctor.newInstance(new Object[]{"Deneme"});
            DBFactory dbFactoryObj = (DBFactory) clazz.cast(obj);
            return dbFactoryObj;
        } catch (Exception e) {
            e.printStackTrace();
        }/* catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/

//        Constructor<?> ctor = clazz.getConstructor(String.class);
//        ctor.newInstance(new Object[]{"Deneme"});

       /* if (db_name == "SQL")
            return new SQLFactory();
        else if (db_name == "Oracle")
            return new OracleFactory();*/
        return null;
    }
}
