package dont.wakeme;

/*
 * Test-class to verify correct behavior of setter validation.
 * BVT = Boundary Value Testing
 * For a [0,20] range, you need to check:
 * 0, 1 and 20, 21
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);    // error message
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);    // error message
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());
    }

}