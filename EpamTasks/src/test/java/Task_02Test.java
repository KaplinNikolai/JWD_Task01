import by.training.epam.homework.Task_02.Task_02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task_02Test {
    private final Task_02 task_02 = new Task_02();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void getMonthDaysNumber(int daysInMonth, int year, int month) {
        assertEquals(daysInMonth, task_02.getMonthDaysNumber(year, month));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(29, 2020, 2),
                Arguments.arguments(28, 2019, 2),
                Arguments.arguments(31, 102, 12),
                Arguments.arguments(30, 1223, 11),
                Arguments.arguments(31, 1984, 1)
        );
    }

    @Test
    void wrongYearTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_02.getMonthDaysNumber(0, 2));
        assertEquals("Year must be AD!", exception.getMessage());
    }

    @Test
    void wrongMonthTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_02.getMonthDaysNumber(10, 20));
        assertEquals("Month out of range!", exception.getMessage());
    }
}