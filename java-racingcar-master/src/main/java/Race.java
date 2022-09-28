import java.util.List;
import java.util.Random;

public class Race {

    private static final Random random = new Random();

    private static final int NUMBER_OF_ADVANCES = 4;
    private static final int RANDOM_BOUND = 10;

    public static void run(final GameSet gameSet) {
        for (int i = 0; i < gameSet.getCount(); i++) {
            runGameRound(gameSet.getCarList());
            ResultView.result(gameSet.getCarList());
        }
    }

    public static void runGameRound(final List<Car> carList) {
        for (Car car : carList) {
            car.move(isRun());
        }
    }

    private static boolean isRun() {
        return random.nextInt(RANDOM_BOUND) > NUMBER_OF_ADVANCES;
    }
}
