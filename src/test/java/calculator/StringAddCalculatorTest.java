package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringAddCalculatorTest {
    @DisplayName("문자열이 null이면 0을 반환")
    @Test
    void nullTest() {
        String str = null;
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(0);
    }
    @DisplayName("문자열이 \"\"이면 0을 반환")
    @Test
    void emptyTest() {
        String str = "";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(0);
    }
    @DisplayName("숫자 하나의 문자열의 경우 해당 숫자를 반환")
    @Test
    void oneTest() {
        String str = "4";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(4);
    }
    @DisplayName(", 로 구분된 문자열인 경우 정상적으로 합을 반환")
    @Test
    void commaTest() {
        String str = "4,5,3";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(12);
    }
    @DisplayName(" : 로 구분된 문자열인 경우 정상적으로 합을 반환")
    @Test
    void colonTest() {
        String str = "4:5:3";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(12);
    }
    @DisplayName(", : 혼합으로 구분된 문자열인 경우 정상적으로 합을 반환")
    @Test
    void colonCommaTest() {
        String str = "4:5,3";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(12);
    }
    @DisplayName("커스텀 구분자 테스트")
    @Test
    void customTest() {
        String str = "//;\n4;5;3";
        int result = StringAddCalculator.splitAndSum(str);
        assertThat(result).isEqualTo(12);
    }
    @DisplayName("음수는 RuntimeException 예외가 발생")
    @Test
    void minusTest() {
        String str = "-1,2,3";
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum(str))
                .isInstanceOf(RuntimeException.class);
    }
}
