package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private List<Car> raceCars;
    private int maxScore = 0;

    public Racing(List<String> list) {
        raceCars = new ArrayList<>();

        for (String name : list) {
            raceCars.add(new Car(name));
        }
    }

    public List<Car> getRaceCars() {
        return raceCars;
    }

    public void play(List<Integer> numbers) {
        for (int i = 0; i < raceCars.size(); i++) {
            Car car = raceCars.get(i);
            car.racing(numbers.get(i));

            int position = car.getPosition();
            if (maxScore < position) {
                maxScore = position;
            }
        }
    }

    public List<String> winner() {
        return raceCars.stream()
                .filter(car -> car.getPosition() == maxScore)
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }
}
