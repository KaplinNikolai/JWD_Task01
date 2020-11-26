import by.training.epam.homework.Task_08.Task_08;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task_08Test {
    private final Task_08 task_08 = new Task_08();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void getFunctionValue(double result, double x) {
        assertEquals(result, task_08.getFunctionValue(x));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(-0.2, 1),
                Arguments.arguments(-0.1329632522811508, -1.15),
                Arguments.arguments(9, 3),
                Arguments.arguments(-39.16, 8.6)
        );
    }

    @Test
    void wrongArgumentTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_08.getFunctionValue(1.81));
        assertEquals("Such an argument results in division by zero!", exception.getMessage());
    }
}