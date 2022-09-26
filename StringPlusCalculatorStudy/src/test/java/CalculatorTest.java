import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    @Test
    @DisplayName("계산기는 배열로 들어온 숫자를 더한다.")
    void calculator_sum_o() {

        //given
        String[] numbers = new String[]{"1", "2", "3"};
        Calculator calculator = new Calculator();

        //when
        int result = calculator.strSum(numbers);

        //then
        assertThat(result).isEqualTo(6);
    }

    @ParameterizedTest
    @MethodSource
    @DisplayName("계산기는 배열로 들어온 음수 or 숫자가 아니면 예외를 던진다.")
    void calculator_sum_x(String[] numbers) {

        Calculator calculator = new Calculator();

        //then
        assertThatThrownBy(() -> calculator.strSum(numbers))
            .isInstanceOf(RuntimeException.class);

    }

    private static Stream<Arguments> calculator_sum_x() {
        return Stream.of(
            Arguments.of((Object) new String[]{"-1"}),
            Arguments.of((Object) new String[]{"1,-1"}),
            Arguments.of((Object) new String[]{"dk"}),
            Arguments.of((Object) new String[]{"0", "1", "adf"}),
            Arguments.of((Object) new String[]{"1", "df", "-1"}),
            Arguments.of((Object) new String[]{"A", "B", "C", "D", "E"})
        );
    }


    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "0", "21332"})
    @DisplayName("숫자 하나만 입력받았을 경우 해당 숫자 반환")
    public void sizeOne(final String numbers) {
        //given
        String[] input = {numbers};

        Calculator calculator = new Calculator();

        assertThat(calculator.strSum(input)).isEqualTo(Integer.valueOf(numbers));
    }
}
