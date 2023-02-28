package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RacingTest {
    @Test
    void racingTest() {
        List<String> list = Arrays.asList("A", "b", "c", "d");
        Racing racing = new Racing(list);

        assertThat(racing.getRaceCars().size()).isEqualTo(4);
        assertThat(racing.getRaceCars().get(0).getName()).isEqualTo("A");
        assertThat(racing.getRaceCars().get(1).getName()).isEqualTo("b");
        assertThat(racing.getRaceCars().get(2).getName()).isEqualTo("c");
        assertThat(racing.getRaceCars().get(3).getName()).isEqualTo("d");
    }

    @Test
    void playTest() {
        List<String> list = Arrays.asList("A", "b", "c", "d");
        Racing racing = new Racing(list);
        List<Integer> randomList = Arrays.asList(1, 3, 5, 7);
        racing.play(randomList);

        List<Car> raceCars = racing.getRaceCars();

        assertThat(raceCars.get(0).getPosition()).isEqualTo(1);
        assertThat(raceCars.get(1).getPosition()).isEqualTo(1);
        assertThat(raceCars.get(2).getPosition()).isEqualTo(2);
        assertThat(raceCars.get(3).getPosition()).isEqualTo(2);
    }

    @Test
    void resultTest() {
        List<String> list = Arrays.asList("A", "b", "c", "d");
        Racing racing = new Racing(list);
        List<Integer> randomList = Arrays.asList(1, 3, 5, 7);
        racing.play(randomList);

        List<String> winnerList = racing.winner();
        assertThat(winnerList.size()).isEqualTo(2);
        assertThat(winnerList.get(0)).isEqualTo("c");
        assertThat(winnerList.get(1)).isEqualTo("d");
    }
}
