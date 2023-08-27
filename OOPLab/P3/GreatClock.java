package P3;

public class GreatClock extends Time {
    int sec;
    int millisec;

    public GreatClock(int hours, int mins, int sec, int millisec) {
        super(hours, mins);
        this.sec = sec;
        this.millisec = millisec;
    }

    public GreatClock add(GreatClock time) {
        int hours = super.add(time).hours;
        int mins = super.add(time).mins;

        int sec = this.sec + time.sec;
        int millisec = this.millisec + time.millisec;

        sec += millisec > 999 ? 1 : 0;
        millisec = millisec > 999 ? millisec - 1000 : millisec;

        return new GreatClock(hours, mins, sec, millisec);
    }

    public GreatClock subtract(GreatClock time) {
        int hours = super.subtract(time).hours;
        int mins = super.subtract(time).mins;

        int sec = this.sec - time.sec;
        int millisec = this.millisec - time.millisec;

        sec -= millisec < 0 ? 1 : 0;
        millisec = millisec < 0 ? millisec + 1000 : millisec;

        return new GreatClock(hours, mins, sec, millisec);
    }

    public String toString() {
        return String.format("%dh %dm %ds %dms", this.hours, this.mins, this.sec, this.millisec);
    }
}
