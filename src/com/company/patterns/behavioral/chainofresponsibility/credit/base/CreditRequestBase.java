package com.company.patterns.behavioral.chainofresponsibility.credit.base;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;

public abstract class CreditRequestBase {
    public boolean creditConfirmed;
    protected CreditRequestBase nextOperation;

    public void setNextOperation(CreditRequestBase nextOperation) {
        this.nextOperation = nextOperation;
    }

    public void execute(Customer c) {
        executeProcess(c);
        if (this.nextOperation != null) {
            this.nextOperation.creditConfirmed = this.creditConfirmed;
            this.nextOperation.execute(c);
        }

    }

    public abstract void executeProcess(Customer custormer);
}
