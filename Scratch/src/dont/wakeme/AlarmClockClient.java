package dont.wakeme;

/*
 * This is a client "main-class", i.e., a class definition with the main() method.
*/
class AlarmClockClient {

    public static void main(String[] args) {
        //create an instance of dont.wakeme.AlarmClock (an dont.wakeme.AlarmClock object) and set its properties
        AlarmClock clock1 = new AlarmClock(7, 5);

        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);

        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }
}