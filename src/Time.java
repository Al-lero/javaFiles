public class Time {
    private final int hour;
    private final int minute;
    private final int second;

    public Time(int hour, int minute, int second) {
       validate();
       this.hour = hour;
       this.minute = minute;
       this.second = second;

    }
    public Time(int hour, int minute){
        this(hour,minute,0);
    }

    public Time(int hour){
        this(hour,0,0);
    }

    public Time(){
        this(0,0,0);
    }

    public int validateHour(){
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        return hour;
    }

    public int validateMinute(){
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        return minute;
    }

    public int validateSecond(){
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        return second;
    }

    public void validate(){
        validateHour();
        validateMinute();
        validateSecond();
    }




}
