package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class GameSet {

    private final int count;
    private final List<Car> carList;

    public GameSet(final String cars, final int count) {
        this.count = count;
        List<String> carsNameList = separateComma(cars).orElseThrow(
            () -> new NullPointerException("자동차 입력을 제대로 해주세요")
        );
        carList = List.copyOf(createCars(carsNameList));
    }

    private Optional<List<String>> separateComma(final String line) {
        if (line.isBlank()) {
            return Optional.empty();
        }
        return Optional.of(Arrays.stream(line.split(",")).collect(Collectors.toList()));
    }

    private List<Car> createCars(final List<String> carNames) {
        List<Car> list = new ArrayList<>();
        for (String name : carNames) {
            list.add(new Car(0, name));
        }
        return list;
    }

    public int getCount() {
        return this.count;
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public List<String> getWinners() {

        OptionalInt maxDistance = carList.stream().mapToInt(Car::getDistance).max();

        return carList.stream()
            .filter(car -> car.isEqualsDistance(maxDistance.getAsInt()))
            .map(Car::getName).collect(Collectors.toList());
    }
}
