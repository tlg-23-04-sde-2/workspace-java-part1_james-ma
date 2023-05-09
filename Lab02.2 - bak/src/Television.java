/*
 * Business class (system class) to model the workings of a television.
 */

class Television {
    // Instance variables or fields (properties or attributes)
    private String brand = "Toshiba";   // default value
    private int volume = 1;     // default value

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instantCount = 0;

    public static int getInstantCount() {
        return instantCount;
    }

    public Television() {
        instantCount++;
    }

    public Television(String brand) {
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // business methods or operations
    void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }

    void turnOff(){
        System.out.println("Shutting down...goodbye");
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    public String toString(){
        return "Brand: " + brand + ", Volume: " + volume;
    }
}