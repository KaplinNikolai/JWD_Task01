package by.training.epam.homework.Task_03;

public class Task_03 {

    private double getSquareAreaInscribedInCircle(double circleRadius) {
        return 2 * circleRadius * circleRadius;
    }

    public double getHowManyTimes(double square) {
        if (square <= 0) {
            throw new IllegalArgumentException("Area value must be greater than zero!");
        }
        double inscribedSquare = getSquareAreaInscribedInCircle(Math.sqrt(square) / 2);
        return square / inscribedSquare;
    }
}
