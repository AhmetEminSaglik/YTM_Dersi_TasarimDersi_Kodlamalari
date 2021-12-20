package com.company.patterns.behavioral.command.undoredo;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.addCommand(new UndoCommand());
        invoker.addCommand(new UndoCommand());
        invoker.addCommand(new RedoCommand());
//        invoker.addCommand(new RedoCommand());
        invoker.executeAll();
    }
}
