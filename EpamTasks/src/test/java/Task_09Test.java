import by.training.epam.homework.Task_09.Task_09;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_09Test {
    private final Task_09 task_09 = new Task_09();

    @Test
    void getCircleMetrics_1() {
        assertEquals("Circumference: 6.28 Area: 3.14", task_09.getCircleMetrics(1));
    }

    @Test
    void getCircleMetrics_2() {
        assertEquals("Circumference: 34.54 Area: 94.985", task_09.getCircleMetrics(5.5));
    }

    @Test
    void getCircleMetrics_3() {
        assertEquals("Circumference: 628.0 Area: 31400.0", task_09.getCircleMetrics(100));
    }

    @Test
    void wrongRadiusTest() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                task_09.getCircleMetrics(-3));
        assertEquals("Radius must be greater than zero!", exception.getMessage());
    }
}