package me.call;

public enum Brand {
    // me.call.Brand instances
    // Each calls the ctor below, passing a display string
    APPLE("iPhone"),
    SAMSUNG("Samsung"),
    XIAOMI("Xiaomi"),
    OPPO("Oppo"),
    VIVO("Vivo"),
    NOKIA("Nokia");

    // everything below here is regular class definition stuff, i.e., fields, ctors, methods
    private final String display;

    // constructor - implicitly private, only called when inside (8 times above)
    Brand(String display) {
        this.display = display;
    }

    // accessor methods - "ready-only"
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}