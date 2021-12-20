package com.company.patterns.behavioral.command.bankandsupplier.command;

import com.company.patterns.behavioral.command.bankandsupplier.ICommand;
import com.company.patterns.behavioral.command.bankandsupplier.ReceiverBank;

public abstract class CommandBank implements ICommand {
    protected ReceiverBank receiverBank;

    public CommandBank(ReceiverBank receiverBank) {
        this.receiverBank = receiverBank;
    }
}
