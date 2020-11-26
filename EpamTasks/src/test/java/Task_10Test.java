import by.training.epam.homework.Task_10.Task_10;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task_10Test {
    private final Task_10 task_10 = new Task_10();
    public List<List<Double>> result = Arrays.asList(Arrays.asList(-240.0, -210.0, -180.0, -150.0, -120.0, -60.0, -30.0, 0.0, 30.0, 60.0, 120.0, 150.0, 180.0, 210.0, 240.0), Arrays.asList(-1.7320508075688754, -0.577350269189626, 1.2246467991473532E-16, 0.5773502691896257, 1.7320508075688783, -1.7320508075688767, -0.5773502691896257, 0.0, 0.5773502691896257, 1.7320508075688767, -1.7320508075688783, -0.5773502691896257, -1.2246467991473532E-16, 0.577350269189626, 1.7320508075688754));

    @Test
    void tanTest() {
        assertEquals(result, task_10.tan(-270, 270, 30));
    }
}