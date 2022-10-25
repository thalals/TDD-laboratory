package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.mockito.BDDMockito;

public class CarTest {

    @Test
    @DisplayName("자동차는 전진시 한칸씩 움직인다.")
    void car() {
        //given
        CarMoveAbleStrategyImpl carMoveAbleStrategy = BDDMockito.mock(
            CarMoveAbleStrategyImpl.class);
        BDDMockito.given(carMoveAbleStrategy.getMoveDistance()).willReturn(1);

        //when
        Car car = new Car(0, "name");

        car.move(carMoveAbleStrategy);

        //then
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "aaaaaaaaaaaaa"})
    @DisplayName("자동차 이름은 빈문자열이거나, 5이상 초과하면 안됨")
    void validName(String name) {
        assertThatThrownBy(() -> new Car(0, name)).isInstanceOf(NullPointerException.class);
    }

}
