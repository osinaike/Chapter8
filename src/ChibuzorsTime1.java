public class ChibuzorsTime1 {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public ChibuzorsTime1 (int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException
                    (String.format("Seconds entered is %s, please enter second between 0 and 59", second));
        }
    }

    private static void validateMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException
                    (String.format("Minute entered is %s, please enter minute between 0 and 59", minute));
        }
    }

    private static void validateHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException
                    (String.format("Hour entered is %s, please enter hour between 0 and 59", hour));
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
