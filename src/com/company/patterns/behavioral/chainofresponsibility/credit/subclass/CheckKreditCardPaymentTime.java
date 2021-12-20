package com.company.patterns.behavioral.chainofresponsibility.credit.subclass;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;
import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;

public class CheckKreditCardPaymentTime extends CreditRequestBase {
    @Override
    public void executeProcess(Customer custormer) {
        if (creditConfirmed) {
            int paymentDelayTime = 1;
        if (paymentDelayTime > 3)
            creditConfirmed = false;
        else
            creditConfirmed = true;
    }}
}
