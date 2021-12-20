package com.company.patterns.behavioral.command.bankandsupplier;

import java.util.Stack;

public class CommandManager {
    public Stack<ICommand> commandStack;

    public CommandManager() {
        commandStack = new Stack<ICommand>();
    }

    public void executeAll() {
        while (commandStack.size() > 0) {
            commandStack.pop().execute();
        }
    }
}
