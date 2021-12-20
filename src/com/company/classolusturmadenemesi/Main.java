package com.company.classolusturmadenemesi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class  Main {
    public static void main(String[] args) {
        String className = CagirmadanClassOlusturma.class.getName();

        try {
            System.out.println("Class name = " + className);
            Class<?> clazz = Class.forName(className);

            Constructor<?> ctor = clazz.getConstructor(String.class);
            ctor.newInstance(new Object[]{"Deneme"});


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
