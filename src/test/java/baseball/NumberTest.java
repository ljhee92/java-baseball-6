package baseball;

import model.Computer;
import model.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("숫자 테스트")
public class NumberTest {

    private Computer computer;
    private Validator validator;

    @BeforeEach
    void setUp() {
        computer = new Computer();
        validator = new Validator();
    } // setUp

    @Test
    @DisplayName("컴퓨터 숫자 테스트")
    void testComputerValidNumber() {
        assertThat(validator.checkValidNumbers(computer.createRandomNumber())).isTrue();
    } // testComputerValidNumber

    @ParameterizedTest(name = "{index} : {1}")
    @DisplayName("사용자 입력 예외 테스트")
    @MethodSource("generateData")
    void testUserInvalidNumber(List<Integer> input, String message) {
        assertThatThrownBy(() -> validator.checkValidNumbers(input))
                .isInstanceOf(IllegalArgumentException.class);
    } // testUserInvalidNumber

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 0), "0포함"),
                Arguments.of(Arrays.asList(1, 2, 2), "중복"),
                Arguments.of(Arrays.asList(1, 2, 3, 4), "4자리")
        );
    } // generateData

} // class