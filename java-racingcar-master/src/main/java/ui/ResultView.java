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
        System.out.print(car.getName() + " : ");

        for (int i = 0; i < car.getDistance(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void winnerPrint(final List<String> winners) {
        for (String winner : winners) {
            System.out.print(winner+", ");
        }
        System.out.println("가 최종 우승했습니다.");
    }

}
