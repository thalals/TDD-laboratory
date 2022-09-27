import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class InputTest {

    @Test
    @DisplayName("들어온 값이 빈값일 경우 false")
    void preEmptyCheck() {
        //given
        String input1 = "";
        Input input = new Input();

        assertThat(input.isEmpty(input1)).isFalse();
    }

    @Test
    @DisplayName("들어온 값이 null일 경우 false")
    void preNullCheck() {
        //given
        String input1 = null;
        Input input = new Input();

        assertThat(input.isEmpty(input1)).isFalse();
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("들어온 값이 null 이거나 빈 값일 경우")
    void preBlankCheck(String input1) {
        Input input = new Input();
        assertThat(input.isEmpty(input1)).isFalse();
    }

    @Test
    @DisplayName("컴마를 구분자로 한다.")
    void commaDelimiter() {
        //given
        String text = "1,2,3";

        Input input = new Input();

        assertThat(input.extractStringArray(text)).isEqualTo(new String[]{"1", "2", "3"});
    }


    @Test
    @DisplayName("콜론을 구분자로 한다.")
    void colonDelimiter() {
        String text = "1:2:3";

        Input input = new Input();

        assertThat(input.extractStringArray(text)).isEqualTo(new String[]{"1", "2", "3"});
    }

    @ParameterizedTest
    @ValueSource(strings = {"//;\n1;2;3;", "//q\n1q2q3"})
    @DisplayName("커스텀 구분자로 체크")
    void customDelimiter(String text) {

        Input input = new Input();

        assertThat(input.extractStringArray(text)).isEqualTo(new String[]{"1", "2", "3"});
    }
}
