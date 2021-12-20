package com.company.patterns.behavioral.command.undoredo;

public class UndoCommand implements  ICommand{
    @Override
    public void execute() {
        System.out.println("Undo command worked");
    }
}
