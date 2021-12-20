package com.company.patterns.behavioral.command.bankandsupplier.command;

import com.company.patterns.behavioral.command.bankandsupplier.ReceiverBank;

public class BankAddCommand extends CommandBank {
    public BankAddCommand(ReceiverBank receiverBank) {
        super(receiverBank);
    }

    @Override
    public void execute() {
        System.out.println("!!! BankAddCommand calistirildi  banka : " + receiverBank.getBankName());
    }
}
