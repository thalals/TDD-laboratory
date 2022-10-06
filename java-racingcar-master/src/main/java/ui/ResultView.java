package ui;

import domain.Car;
import java.util.List;

public class ResultView {

    public static void result(final List<Car> cars) {
        for (Car car : cars) {
            printCarDistance(car);
        }
        System.out.println();
    }
    private static void printCarDistance(final Car car) {
        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
