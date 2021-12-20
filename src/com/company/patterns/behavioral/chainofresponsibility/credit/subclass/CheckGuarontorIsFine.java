package com.company.patterns.behavioral.chainofresponsibility.credit.subclass;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;
import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;

public class CheckGuarontorIsFine extends CreditRequestBase {
    @Override
    public void executeProcess(Customer custormer) {
        if (creditConfirmed) {
            boolean quarantorIsFine = true;
            if (quarantorIsFine)
                creditConfirmed = true;
            else
                creditConfirmed = false;
        }
    }
}
