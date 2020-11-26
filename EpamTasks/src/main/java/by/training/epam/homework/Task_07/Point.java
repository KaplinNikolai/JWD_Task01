package by.training.epam.homework.Task_07;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceToOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
