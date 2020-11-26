package by.training.epam.homework.Task_05;

import by.training.epam.homework.Task_04.Task_04;

import java.util.logging.Logger;

public class Task_05 {
    final Logger log = Logger.getLogger(Task_05.class.getName());

    public boolean isPerfectNumber(long num) {
        long sum = 0;
        boolean answer;
        for (long i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        answer = sum == num;
        log.info(String.valueOf(answer));
        return answer;
    }
}
