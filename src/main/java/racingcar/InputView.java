package racingcar;

import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);
    public String nameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        return sc.nextLine();
    }

    public void printNameError(String message) {
        System.out.println(message);
    }

    public int timesInput() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Integer.parseInt(sc.nextLine());
    }
}
