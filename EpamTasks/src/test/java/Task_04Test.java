import by.training.epam.homework.Task_04.Task_04;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task_04Test {
    private final Task_04 task_04 = new Task_04();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void isTrue(boolean isTrue, int A, int B, int C, int D) {
        assertEquals(isTrue, task_04.isTrue(A, B, C, D));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(true, 1, 29, 2020, 2),
                Arguments.arguments(true, 10, 290, -700, 0),
                Arguments.arguments(true, 0, 0, 0, 0),
                Arguments.arguments(false, 1, 3, 5, 2),
                Arguments.arguments(false, -1, 0, 123, -7)
        );
    }
}