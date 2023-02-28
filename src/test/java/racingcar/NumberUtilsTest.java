package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class NumberUtilsTest {
    @DisplayName("랜덤 숫자가 0 ~ 9 사이의 숫자이다")
    @Test
    void rangeTest() {
        int random = NumberUtils.randomGenerate();
        assertThat(random >= 0 && random <= 9).isTrue();
    }


    @DisplayName("원하는 갯수의 랜덤 수 리스트를 반환한다")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "3:3", "7:7", "10:10"}, delimiter = ':')
    void randomListTest(int input, int result) {
        List<Integer> list = NumberUtils.randomListGenerator(input);

        assertThat(list.size()).isEqualTo(result);
    }
}
