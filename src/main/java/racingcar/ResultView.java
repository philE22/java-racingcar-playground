package racingcar;

import java.util.List;

public class ResultView {

    public void printPosition(List<Car> raceCars) {
        for (Car car : raceCars) {
            StringBuffer sb = new StringBuffer();
            sb.append(car.getName());
            for (int i = 0; i < (5 - car.getName().length()); i++) {
                sb.append(" ");
            }
            sb.append(" : ");
            for (int i = 0; i < car.getPosition(); i++) {
                sb.append("-");
            }
            System.out.println(sb.toString());
        }
        System.out.println();
    }

    public void printWinner(List<String> winner) {
        String result = "";
        for (String name : winner) {
            result += name + ", ";
        }
        result = result.substring(0, result.length() - 2) + "가 최종 우승했습니다.";
        System.out.println(result);
    }
}
