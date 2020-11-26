import by.training.epam.homework.Task_07.Point;
import by.training.epam.homework.Task_07.Task_07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_07Test {
    private final Task_07 task_07 = new Task_07();
    Point A = new Point(1, -2);
    Point B = new Point(1, 3);
    Point C = new Point(-13, 2);

    @Test
    void whichIsCloser_1() {
        assertEquals(A, task_07.whichIsCloser(A, B));
    }

    @Test
    void whichIsCloser_2() {
        assertEquals(A, task_07.whichIsCloser(A, C));
    }

    @Test
    void whichIsCloser_3() {
        assertEquals(B, task_07.whichIsCloser(C, B));
    }
}