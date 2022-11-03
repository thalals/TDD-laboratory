package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class GameSetTest {

    @Test
    @DisplayName("쉼표로 자동차의 이름을 구분하여 갯수를 카운팅")
    void countCarForStr() {
        String cars = "a,b,c";

        //then
        GameSet result = new GameSet(cars, 1);
        assertThat(result.getCarList().size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    @DisplayName("자동차가 입력되지 않았을 때")
    void checkOneCar(String cars) {

        //then
        assertThatThrownBy(() -> new GameSet(cars, 1))
            .isInstanceOf(NullPointerException.class)
            .hasMessageMatching("자동차 입력을 제대로 해주세요");
    }

    @Test
    @DisplayName("자동차 이름이 잘 매칭되어 생성되는지 확인")
    void checkCarsName() {
        String cars = "a,b,c";

        //then
        GameSet result = new GameSet(cars, 1);

        int cnt =0;
        for(Car car : result.getCarList()){
            assertThat(car.getName()).isEqualTo(cars.split(",")[cnt++]);
        }
        assertThat(result.getCarList().size()).isEqualTo(3);
    }


    @Test
    @DisplayName("우승자 반환")
    void whoWinner(){
        String cars = "a,b,c";
        GameSet gameSet = new GameSet(cars, 3);

        gameSet.getCarList().get(0).move(() -> 1);

        //then
        assertThat(gameSet.getWinners()).isEqualTo(List.of("a"));
    }

    @Test
    @DisplayName("우승자가 복수일 때 반환")
    void whoTwoWinner(){
        String cars = "a,b,c";
        GameSet gameSet = new GameSet(cars, 3);

        for(int i =0; i<2; i++) {
            gameSet.getCarList().get(i).move(() -> 1);
        }

        //then
        assertThat(gameSet.getWinners()).isEqualTo(List.of("a","b"));
    }

}