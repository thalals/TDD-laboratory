import java.util.Scanner;

public class GameRun {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Scanner scanner = new Scanner(System.in);

        inputView.printCarsAsking();
        int numberOfCars = scanner.nextInt();

        inputView.printCountAsking();
        int racingRound = scanner.nextInt();

        System.out.println("실행결과");
        Race.run(new GameSet(numberOfCars, racingRound));
    }
}
