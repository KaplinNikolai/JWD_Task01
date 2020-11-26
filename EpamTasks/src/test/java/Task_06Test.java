import by.training.epam.homework.Task_06.Task_06;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_06Test {
    private final Task_06 task_06 = new Task_06();

    @Test
    void currentTime_1() {
        assertEquals("Hours: 12 Minutes: 730 Seconds: 43839", task_06.currentTime(43840));
    }

    @Test
    void currentTime_2() {
        assertEquals("Hours: 0 Minutes: 1 Seconds: 60", task_06.currentTime(61));
    }

    @Test
    void currentTime_3() {
        assertEquals("Hours: 1 Minutes: 60 Seconds: 3600", task_06.currentTime(3601));
    }

    @Test
    void wrongValue() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_06.currentTime(-43840));
        assertEquals("The number of seconds is out of range!", exception.getMessage());
    }
}