package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @DisplayName("이름이 5자 이상이면 예외가 발생한다")
    @Test
    void nameTest() {
        assertThatThrownBy(() -> new Car("test123"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("최초 차를 만들면 position은 1이다")
    @Test
    void positionTest() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(1);
    }
    @DisplayName("4이상의 수가 들어오면 position이 1 증가한다")
    @Test
    void racingTest() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(1);
        car.racing(5);
        assertThat(car.getPosition()).isEqualTo(2);
    }
    @DisplayName("4이하의 수가 들어오면 position이 증가하지 않는다")
    @Test
    void racingTest2() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(1);
        car.racing(3);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
