import domain.Car;
import domain.CarMoveAbleStrategyImpl;
import domain.GameSet;
import java.util.List;
import ui.ResultView;

public class Race {

    public static void run(final GameSet gameSet) {
        for (int i = 0; i < gameSet.getCount(); i++) {
            runGameRound(gameSet.getCarList());
            ResultView.result(gameSet.getCarList());
        }
        ResultView.winnerPrint(gameSet.getWinners());
    }

    public static void runGameRound(final List<Car> carList) {
        for (Car car : carList) {
            car.move(new CarMoveAbleStrategyImpl());
        }
    }
}
