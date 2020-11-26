package by.training.epam.homework.Task_01;

public class Task_01 {

    private int getLastDigit(int number) {
        return number%10;
    }

    public int getSquareLastDigit (int number) {
        int lastDigit = getLastDigit(number);
        int result;
        switch (lastDigit) {
            case (1):
            case (9):
                result=1;
                break;
            case (2):
            case (8):
                result=4;
                break;
            case (3):
            case (7):
                result=9;
                break;
            case (4):
            case (6):
                result=6;
                break;
            case (5):
                result=5;
                break;
            default:
                result=0;
                break;
        }
        return result;
    }
}
