package P3;

public class Time {
    int hours;
    int mins;

    public Time(int hours, int mins) {
        if (hours < 0 || mins < 0) {
            throw new IllegalArgumentException("Invalid time");
        }
        this.hours = hours;
        this.mins = mins;
    }

    public Time add(Time time) {
        int mins = this.mins + time.mins;
        int hours = this.hours + time.hours;

        hours += mins > 59 ? 1 : 0;
        mins = mins > 59 ? mins - 60 : mins;

        hours = hours > 23 ? hours - 24 : hours;

        return new Time(hours, mins);
    }

    public Time subtract(Time time) {
        int mins = this.mins - time.mins;
        int hours = this.hours - time.hours;

        hours -= mins < 0 ? 1 : 0;
        mins += mins < 0 ? 60 : 0;

        hours = hours < 0 ? hours + 24 : hours;

        return new Time(hours, mins);
    }

    public String toString() {
        String h = this.hours < 9 ? String.format("0%d", this.hours) : String.format("%d", this.hours);
        String m = this.mins < 9 ? String.format("0%d", this.mins) : String.format("%d", this.mins); 
        return String.format("%s:%s", h, m);
    }
}