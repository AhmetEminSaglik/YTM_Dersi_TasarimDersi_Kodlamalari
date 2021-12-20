package com.company.patterns.behavioral.chainofresponsibility.credit.subclass;

import com.company.patterns.behavioral.chainofresponsibility.credit.Customer;
import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;


public class CheckCompanyCustormerWork extends CreditRequestBase {
    @Override
    public void executeProcess(Customer custormer) {
        if (creditConfirmed) {
            boolean companyIsFine = true;
            if (companyIsFine)
                creditConfirmed = true;
            else
                creditConfirmed = false;
        }
    }
}
