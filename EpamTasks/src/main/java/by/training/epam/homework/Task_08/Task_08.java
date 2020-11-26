package by.training.epam.homework.Task_08;

public class Task_08 {
    public double getFunctionValue(double x) {
        if (x < 3) {
            return secondCondition(x);
        } else {
            return firstCondition(x);
        }
    }

    private double firstCondition(double x) {
        return -1 * x * x + 3 * x + 9;
    }

    private double secondCondition(double x) {
        if (x <= 1.82 && x >= 1.8) {
            throw new IllegalArgumentException("Such an argument results in division by zero!");
        }
        return 1 / (x * x * x - 6);
    }
}
