package dont.wakeme;/*
 * Class definition to model the working of an alarm clock.
 * This is called a "business class" or "system class".
 */


class AlarmClock {
    // properties or attributes - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;
    private int repeat = 1;

    // There is only one copy of these shared in the common
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    public AlarmClock(){
    }
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval);
    }
    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval); // delegate to ctor above for snoozeInterval
        setRepeat(repeat); // handle itself
    }

    // accessor methods (get/set methods)
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {   // valid
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                    ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    // functions or "methods" - what do AlarmClocks do?
    void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes");
    }

    public String toString() {
        return "dont.wakeme.AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat=" + getRepeat(); // call my own getter
    }
}