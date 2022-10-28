package com.example.testfixturelab.domain;

import com.example.testfixturelab.MoneyFixtures;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyFixtureTest {
    private final Money m12CHF = MoneyFixtures.createMoney(12);
    private final Money m14CHF = MoneyFixtures.createMoney(14);

    @Test
    public void simpleAdd() {
        Money expected = MoneyFixtures.createMoney(26);
        Money result= m12CHF.add(m14CHF);

        Assertions.assertThat(expected).isEqualTo(result);
    }
}
