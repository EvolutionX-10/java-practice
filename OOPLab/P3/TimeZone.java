package P3;

public class TimeZone {
    int hoursOffset;
    int minsOffset;
    Time time;

    public TimeZone(Time time) {
        this.time = time;
    }

    public Time convert(int hoursOffset, int minsOffset) {
        return hoursOffset > 0 ? this.time.add(new Time(hoursOffset, minsOffset))
                : this.time.subtract(new Time(hoursOffset * -1, minsOffset));
    }
}
