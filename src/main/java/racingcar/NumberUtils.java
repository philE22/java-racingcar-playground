package racingcar;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int randomGenerate() {
        return (int) (Math.random() * 10);
    }

    public static List<Integer> randomListGenerator(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(randomGenerate());
        }

        return list;
    }
}
