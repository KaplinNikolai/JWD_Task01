package by.training.epam.homework.Task_04;

import java.util.logging.Logger;

public class Task_04 {
    final Logger log = Logger.getLogger(Task_04.class.getName());

    public boolean isEven(int number) {
        boolean isEven;
        isEven = number % 2 == 0;
        return isEven;
    }

    public boolean isTrue(int A, int B, int C, int D) {
        int[] list = {A, B, C, D};
        int counter = 0;
        boolean answer;
        for (int num : list) {
            if (isEven(num)) {
                counter++;
            }
        }
        answer = counter >= 2;
        log.info(String.valueOf(answer));
        return answer;
    }
}
