import by.training.epam.homework.Task_01.Task_01;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task_01Test {
    private final Task_01 task_01 = new Task_01();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void getSquareLastDigit(int lastDigitSquare, int number) {
        assertEquals(lastDigitSquare, task_01.getSquareLastDigit(number));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(0, 100),
                Arguments.arguments(1, 101),
                Arguments.arguments(4, 102),
                Arguments.arguments(9, 103),
                Arguments.arguments(6, 104),
                Arguments.arguments(5, 105),
                Arguments.arguments(6, 106),
                Arguments.arguments(9, 107),
                Arguments.arguments(4, 108),
                Arguments.arguments(1, 109)
        );
    }
}