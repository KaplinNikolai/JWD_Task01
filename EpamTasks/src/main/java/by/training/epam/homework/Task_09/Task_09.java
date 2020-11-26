package by.training.epam.homework.Task_09;

public class Task_09 {
    private final double PI = 3.14;

    public String getCircleMetrics(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero!");
        }
        double circumference = getCircumference(r);
        double area = getCircleArea(r);
        return "Circumference: " + circumference + " Area: " + area;
    }

    private double getCircumference(double r) {
        return 2 * PI * r;
    }

    private double getCircleArea(double r) {
        return PI * r * r;
    }
}
