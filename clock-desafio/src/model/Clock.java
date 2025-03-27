package model;

public sealed abstract class Clock permits BRLClock, USClock {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24 ){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinutes() {
        return minute;
    }

    public void setMinutes(int minute) {
        if (minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    public String getTime(){
        return this.getHour() + ":" + this.getMinutes() + ":" + this.getMinutes();
    }

    abstract Clock convert(Clock clock);
}
