/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic test-drive
 */
class TelevisionClient {
    public static void main(String[] args){

        System.out.println(Television.getInstantCount() + " instances has been created");
        System.out.println();

        // Create an instance of Television and set properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);

        // Turn it on
        tv1.turnOn();

        // Create 2nd instance of Television object, and turn it on
        Television tv2 = new Television("Sony", Television.MIN_VOLUME, DisplayType.LED);
        tv2.turnOn();

        // Create 3rd instance of Television object, but don't set properties
        Television tv3 = new Television("LG");
        tv3.turnOn();

        // Turn off all tvs
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println(Television.getInstantCount() + " instances has been created");
    }
}