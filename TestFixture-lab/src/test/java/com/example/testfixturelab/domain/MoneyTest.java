package com.example.testfixturelab.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MoneyTest {

    private static Money f12CHF_fixture;
    private static Money f14CHF_fixture;
    private static Money f28USD_fixture;

    @BeforeAll
    public static void setUp() {
        f12CHF_fixture= new Money(12, "CHF");
        f14CHF_fixture= new Money(14, "CHF");
        f28USD_fixture= new Money(28, "USD");
    }

    @Test
    public void simpleAdd() {
        Money m12CHF= new Money(12, "CHF");
        Money m14CHF= new Money(14, "CHF");
        Money expected= new Money(26, "CHF");
        Money result= m12CHF.add(m14CHF);

        Assertions.assertThat(expected).isEqualTo(result);
    }

}