package com.company.patterns.behavioral.command.bankandsupplier.command;

import com.company.patterns.behavioral.command.bankandsupplier.ReceiverBank;

public class BankDeleteCommand extends CommandBank {

    public BankDeleteCommand(ReceiverBank receiverBank) {
        super(receiverBank);
    }

    @Override
    public void execute() {
        System.out.println("!!! BankDeleteCommand calistirildi  banka : " + receiverBank.getBankName());
    }
}
