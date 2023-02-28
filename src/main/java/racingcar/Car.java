package racingcar;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("이름은 빈칸일 수 없습니다.");
        }
        this.name = name;
        this.position = 1;
    }

    public void racing(int num) {
        if (num >= 4) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
