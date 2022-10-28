package com.example.testfixturelab;

import com.example.testfixturelab.domain.Money;

public class MoneyFixtures {

    public static Money createMoney(final int money) {
        return new Money(money, "default");
    }

    public static Money createMoney(final String country) {
        return new Money(10000, country);
    }

    public static Money createMoney(final int money, final String country) {
        return new Money(money, country);
    }
}
