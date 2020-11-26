package by.training.epam.homework.Task_06;

public class Task_06 {
    public String currentTime (int secs) {
        if (secs <= 0 || secs > 86400) {
            throw new IllegalArgumentException("The number of seconds is out of range!");
        }
        int seconds = secs - 1;
        int hours = getHours(seconds);
        int minutes = getMinutes(seconds);
       return ("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
    }
    public int getHours (int secs) {
        return secs/3600;
    }

    public int getMinutes (int secs) {
        return secs/60;
    }
}
