package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

public class CarTest {

    @Test
    @DisplayName("자동차는 전진시 한칸씩 움직인다.")
    void car() {
        //given
        CarMoveAbleStrategyImpl carMoveAbleStrategy = BDDMockito.mock(CarMoveAbleStrategyImpl.class);
        BDDMockito.given(carMoveAbleStrategy.getMoveDistance()).willReturn(1);

        //when
        Car car = new Car();
        car.move(carMoveAbleStrategy);

        //then
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
