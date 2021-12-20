package com.company.patterns.behavioral.chainofresponsibility.credit.subclass;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;
import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;

public class CheckKbbScore extends CreditRequestBase {
    @Override
    public void executeProcess(Customer custormer) {
        int kbbScore = 1200;
        if (kbbScore > 1000) {
            creditConfirmed = true;
        } else {
            creditConfirmed = false;
        }
    }
}
