/*
 * Business class (system class) to model the workings of a television.
 */

class Television {
    // Instance variables or fields (properties or attributes)
    private String brand = "Toshiba";   // default value
    private int volume = 1;     // default value
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;    // getter only
    private int previousVolume;      // internal use only, no getter/setter

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
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand){
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ". The brand must be one of the following:" +
                        "Samsung, LG, Sony, Toshiba");
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {   // valid
            isMuted = false;
            this.volume = volume;
        }
        else {
            System.out.println("Invalid volume: " + volume +
                    ". Must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }
// business methods or operations

    public void mute() {
        if (!isMuted()) {
            previousVolume = getVolume();
            volume = MIN_VOLUME;
            isMuted = true;
        }
        else {
            setVolume(this.previousVolume);
            isMuted = false;
        }
    }

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
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: Brand=" + brand + ", Volume=" + volumeString + ", Display= " + getDisplay();
    }
}