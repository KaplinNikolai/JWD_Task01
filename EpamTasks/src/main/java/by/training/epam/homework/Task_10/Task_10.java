package by.training.epam.homework.Task_10;

import java.util.LinkedList;
import java.util.List;

public class Task_10 {

    public List<List<Double>> tan(double a, double b, double h) {

        List<Double> angle = new LinkedList<>();
        List<Double> tan = new LinkedList<>();
        List<List<Double>> result = new LinkedList<>();

        for (double x = a; x <= b; x = x + h) {
            // Degree value must be in range x ≠ π/2 + πk, kЄ Z
            if (!(x % 90 == 0 && (x / 90) % 2 != 0)) {
                double radians = Math.toRadians(x);
                angle.add(x);
                tan.add(Math.tan(radians));
            }
        }

        result.add(angle);
        result.add(tan);
        return result;
    }

}

