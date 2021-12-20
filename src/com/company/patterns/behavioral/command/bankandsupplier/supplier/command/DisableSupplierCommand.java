package com.company.patterns.behavioral.command.bankandsupplier.supplier.command;

import com.company.patterns.behavioral.command.bankandsupplier.supplier.ReceiveSupplier;

public class DisableSupplierCommand extends SupplierCommand {
    public DisableSupplierCommand(ReceiveSupplier receiveSupplier) {
        super(receiveSupplier);
    }

    @Override
    public void execute() {
        System.out.println("-" + receiveSupplier.getSupplierId() + "' id'li" + receiveSupplier.getSupplierName() + " adli supplier pasif edildi");
    }
}
