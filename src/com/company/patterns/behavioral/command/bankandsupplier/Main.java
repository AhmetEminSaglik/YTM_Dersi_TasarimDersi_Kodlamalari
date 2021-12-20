package com.company.patterns.behavioral.command.bankandsupplier;

import com.company.patterns.behavioral.command.bankandsupplier.command.BankAddCommand;
import com.company.patterns.behavioral.command.bankandsupplier.command.BankDeleteCommand;
import com.company.patterns.behavioral.command.bankandsupplier.supplier.command.DisableSupplierCommand;
import com.company.patterns.behavioral.command.bankandsupplier.supplier.command.EnableSupplierCommand;
import com.company.patterns.behavioral.command.bankandsupplier.supplier.ReceiveSupplier;

public class Main {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();

        ReceiverBank bank1 = new ReceiverBank("Banka 1");
        ReceiverBank bank2 = new ReceiverBank("Banka 2");

        ICommand addBankCommand = new BankAddCommand(bank1);
        ICommand deleteBankComand = new BankDeleteCommand(bank2);

        ReceiveSupplier supplier1 = new ReceiveSupplier(1, "Supplier 1");
        ReceiveSupplier supplier2 = new ReceiveSupplier(2, "Supplier 2");

        ICommand enableSupplierCommand = new EnableSupplierCommand(supplier1);
        ICommand disableSupplierCommand = new DisableSupplierCommand(supplier2);

        commandManager.commandStack.push(addBankCommand);
        commandManager.commandStack.push(deleteBankComand);
        commandManager.commandStack.push(enableSupplierCommand);
        commandManager.commandStack.push(disableSupplierCommand);
        commandManager.executeAll();

    }
}
