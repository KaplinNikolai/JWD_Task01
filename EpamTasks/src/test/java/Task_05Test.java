import by.training.epam.homework.Task_05.Task_05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_05Test {
    private final Task_05 task_05 = new Task_05();

    @Test
    void isPerfectNumber_1() {
        assertTrue(task_05.isPerfectNumber(8589869056L));
    }

    @Test
    void isPerfectNumber_2() {
        assertTrue(task_05.isPerfectNumber(6));
    }

    @Test
    void isPerfectNumber_3() {
        assertFalse(task_05.isPerfectNumber(9));
    }

    @Test
    void isPerfectNumber_4() {
        assertFalse(task_05.isPerfectNumber(109564));
    }

}