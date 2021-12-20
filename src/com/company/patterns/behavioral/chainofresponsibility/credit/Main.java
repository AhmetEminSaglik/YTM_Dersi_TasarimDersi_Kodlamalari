package com.company.patterns.behavioral.chainofresponsibility.credit;

import com.company.patterns.behavioral.chainofresponsibility.credit.base.CreditRequestBase;
import com.company.patterns.behavioral.chainofresponsibility.credit.subclass.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditRequestBase> creditOperations = new ArrayList<>();
        creditOperations.add(new CheckKbbScore());
        creditOperations.add(new CheckKreditCardPaymentTime());
        creditOperations.add(new CheckGuarontorIsFine());
        creditOperations.add(new CustomerEarningsIsEnoughToPayCredit());
        creditOperations.add(new CheckCompanyCustormerWork());

        creditOperations.get(0).setNextOperation(creditOperations.get(1));
        creditOperations.get(1).setNextOperation(creditOperations.get(2));
        creditOperations.get(2).setNextOperation(creditOperations.get(3));
        creditOperations.get(3).setNextOperation(creditOperations.get(4));

        creditOperations.get(0).execute(new Customer());


    }

}
