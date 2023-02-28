package racingcar;

import java.util.Arrays;
import java.util.List;

public class RacingApplication {
    public static void main(String[] args) throws InterruptedException {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        Racing racing;

        while (true) {
            String input = inputView.nameInput();
            String[] split = input.split(",");
            try {
                racing = new Racing(Arrays.asList(split));
                break;
            } catch (IllegalArgumentException e) {
                inputView.printNameError(e.getMessage());
            }
        }
        int carsCount = racing.getRaceCars().size();
        int times = inputView.timesInput();

        System.out.println("실행 결과");
        resultView.printPosition(racing.getRaceCars());
        Thread.sleep(1000);
        for (int i = 0; i < times; i++) {
            List<Integer> randomList = NumberUtils.randomListGenerator(carsCount);
            racing.play(randomList);

            resultView.printPosition(racing.getRaceCars());
            Thread.sleep(1000);
        }

        resultView.printWinner(racing.winner());
    }
}
