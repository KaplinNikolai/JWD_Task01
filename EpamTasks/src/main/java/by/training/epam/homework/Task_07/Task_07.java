package by.training.epam.homework.Task_07;

public class Task_07 {

    public Point whichIsCloser(Point A, Point B) {
        if (A.getDistanceToOrigin() < B.getDistanceToOrigin()) {
            return A;
        } else {
            return B;
        }
    }
}


