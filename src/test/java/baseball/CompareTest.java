package baseball;

import model.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("비교 테스트")
public class CompareTest {

    private Comparator comparator;

    @BeforeEach
    void setUp() {
        comparator = new Comparator();
    } // setUp

    @ParameterizedTest(name = "{index} : {2}")
    @DisplayName("숫자 비교 테스트")
    @MethodSource("generateData")
    void testCompareNumber(List<Integer> computerNumbers, List<Integer> userNumbers, String output) {
        assertThat(comparator.compareNumber(computerNumbers, userNumbers)).isEqualTo(output);
    } // testCompareNumber

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), "3스트라이크"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 5), "2스트라이크"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 4, 5), "1스트라이크"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(2, 1, 3), "2볼 1스트라이크"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 5), "1볼 1스트라이크"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(3, 1, 2), "3볼"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(3, 5, 1), "2볼"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(6, 3, 5), "1볼"),
                Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), "낫싱")
        );
    } // generateData

} // class