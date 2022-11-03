import domain.GameSet;
import java.util.Scanner;
import ui.InputView;

public class MainRun {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Scanner scanner = new Scanner(System.in);

        inputView.printCarsAsking();
        String numberOfCars = scanner.nextLine();

        inputView.printCountAsking();
        int racingRound = scanner.nextInt();

        System.out.println("실행결과");
        Race.run(new GameSet(numberOfCars, racingRound));
    }
}
