package by.training.epam.homework.Task_02;

public class Task_02 {
    public static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMonthDaysNumber(int year, int month) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be AD!");
        }
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month out of range!");
        }
        int result;
        if (month == 2) {
            if (isLeapYear(year)) {
                result = DAYS_PER_MONTH[month - 1] + 1;
            } else {
                result = DAYS_PER_MONTH[month - 1];
            }
        } else {
            result = DAYS_PER_MONTH[month - 1];
        }
        return result;
    }

    private boolean isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = year % 4 == 0;
        return isLeapYear;
    }
}

