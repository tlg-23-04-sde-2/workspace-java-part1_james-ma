package me.call.client;

import me.call.Brand;
import me.call.CellPhone;

import java.time.LocalDate;

class CellPhoneClient {

    public static void main(String[] args) {
        System.out.println(CellPhone.getInstanceCount() + " instances has been created");
        System.out.println();

        // Create an instance of Cellphone and set properties
        CellPhone c1 = new CellPhone();
        c1.setBrand(Brand.NOKIA);
        c1.setScreenSize(CellPhone.MAX_SCREENSIZE);
        c1.setReleaseDate(LocalDate.of(2022, 6, 1));
        c1.installService();

        // Make a call
        c1.call();

        System.out.println();

        // Create 2nd instance of Cellphone object, and take a photo
        CellPhone c2 = new CellPhone(Brand.APPLE, "Black");
        c2.takePhoto();

        System.out.println();

        // Create 3rd instance of com.entertainment.Television object
        CellPhone c3 = new CellPhone(Brand.SAMSUNG, "Yellow", 6.0);
        c3.installService();
        c3.takePhoto();
        c3.call();

        System.out.println();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(CellPhone.getInstanceCount() + " instances has been created");
    }
}