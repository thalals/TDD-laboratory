package com.example.testfixturelab.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Money {

    private int money;
    private String country;

    public Money add(Money anotherMoney) {
        checkOrigin(anotherMoney.getCountry());
        money+= anotherMoney.getMoney();

        return new Money(money, country);
    }
    private void checkOrigin(final String country) {
        if (!country.equals(country)) {
            throw new NullPointerException("같은 나라 돈이 아니에여!");
        }
    }
}
