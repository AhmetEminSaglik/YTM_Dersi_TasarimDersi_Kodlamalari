package com.company.patterns.behavioral.command.undoredo;

public class RedoCommand implements ICommand{
    @Override
    public void execute() {
        System.out.println("Redo command worked");
    }
}
