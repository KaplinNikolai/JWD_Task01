import by.training.epam.homework.Task_03.Task_03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_03Test {
    private final Task_03 task_03 = new Task_03();

    @Test
    void getHowManyTimes_1() {
        assertEquals(2, task_03.getHowManyTimes(16));
    }

    @Test
    void getHowManyTimes_2() {
        assertEquals(2, task_03.getHowManyTimes(37.6));
    }

    @Test
    void wrongSquare() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_03.getHowManyTimes(-23));
        assertEquals("Area value must be greater than zero!", exception.getMessage());
    }
}