package me.call;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Class definition to model the workings of a cellphone set.
 */

public class CellPhone {
    // CLASS (static) variables - these are shared among all instances
    public static final double MIN_SCREENSIZE = 1.0;
    public static final double MAX_SCREENSIZE = 10.0;
    public static final String[] VALID_COLORS = { "Black", "White", "Red", "Blue", "Green", "Yellow" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // PROPERTIES or ATTRIBUTES, generally called "fields" or "instance variables"
    private Brand brand;
    private String color;
    private double screenSize;
    private LocalDate releaseDate;
    private boolean hasService;

    // CONSTRUCTORS - special methods that get called when the client says "new"
    public CellPhone() {
        instanceCount++;
    }

    public CellPhone(Brand brand) {
        this();             // delegate to no-arg ctor for instance count
        setBrand(brand);
    }

    public CellPhone(Brand brand, String color) {
        this(brand);        // delegate to other ctor above for brand
        setColor(color);  // handle color myself, by delegating to setter
    }

    public CellPhone(Brand brand, String color, double screenSize) {
        this(brand, color);
        setScreenSize(screenSize);
    }

    // BUSINESS METHODS (functions)
    public void call(){
        if (verifyService()) {
            System.out.printf("The phone is making a call...\n");
        }
        else {
            System.out.println("The phone does not have service, try again later.");
        }
    }

    public void takePhoto(){
        System.out.println("The phone is taking a photo.");
    }

    // ACCESSOR METHODS - these provide "controlled access" to the (private) fields
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (isValidColor(color)) {
            this.color = color;
        }
        else {
            String colors = Arrays.toString(VALID_COLORS);
            System.out.printf("Invalid color: %s. Valid brands are: %s.\n");
        }
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (MIN_SCREENSIZE <= screenSize && screenSize <= MAX_SCREENSIZE) {
            this.screenSize = screenSize;
        }
        else {
            System.out.printf("Invalid screen size: %s. Valid range is %s to %s.\n",
                    screenSize, MIN_SCREENSIZE, MAX_SCREENSIZE);
        }
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void installService() {
        hasService = true;
    }
    public boolean verifyService() {
        return hasService;
    }

    private static boolean isValidColor(String color) {
        boolean isValid = false;

        for (String validColor : VALID_COLORS) {
            if (validColor.equalsIgnoreCase(color)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    @Override
    public String toString() {
        String serviceStatus = verifyService() ? "Yes" : "No";
        return String.format("Cellphone: brand=%s, color=%s, screen size=%s, release date=%s, service=%s",
                getBrand(), getColor(), getScreenSize(), getReleaseDate(), serviceStatus);
    }
}