package com.company.patterns.behavioral.command.bankandsupplier.supplier.command;

import com.company.patterns.behavioral.command.bankandsupplier.ICommand;
import com.company.patterns.behavioral.command.bankandsupplier.supplier.ReceiveSupplier;

public abstract class SupplierCommand implements ICommand {
    protected ReceiveSupplier receiveSupplier;

    public SupplierCommand(ReceiveSupplier receiveSupplier) {
        this.receiveSupplier = receiveSupplier;
    }

    @Override
    public abstract void execute();

}
