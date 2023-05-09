package me.call.test;

import me.call.CellPhone;

class CellphoneValidationTest {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        cellPhone.setScreenSize(1.0); // should stick
        System.out.println(cellPhone); // screen size should be .0

        cellPhone.setScreenSize(10.0); // should stick
        System.out.println(cellPhone); // volume should be 100

        cellPhone.setScreenSize(-1.0); // error message, screen size not set
        cellPhone.setScreenSize(10.1); // error message, screen size not set

        System.out.println(cellPhone); // should still have screen size 10.0, from before
        System.out.println();


        cellPhone.setColor("Black"); // should stick
        System.out.println(cellPhone); // color should be black

        cellPhone.setColor("White"); // should stick
        System.out.println(cellPhone); // color should be white

        cellPhone.setColor("Blue"); // should stick
        System.out.println(cellPhone); // brand should be blue

        cellPhone.setColor("INVALID"); // error message, color not set
        System.out.println(cellPhone); // should still be blue, from before
        System.out.println();
    }
}