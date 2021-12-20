package com.company.patterns.behavioral.chainofresponsibility.credit.subclass;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;
import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;

public class CustomerEarningsIsEnoughToPayCredit extends CreditRequestBase {
    @Override
    public void executeProcess(Customer custormer) {
        if (creditConfirmed) {

            if (creditConfirmed) {
                boolean isEnoughToPay = true;
                if (isEnoughToPay)
                    creditConfirmed = true;
                creditConfirmed = false;
            }
        }
    }
}
