import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차는 전진시 한칸씩 움직인다.")
    void car() {
        Car car = new Car();
        car.move(true);
        //then
        assertThat(car.getDistance()).isEqualTo(1);
    }
}
