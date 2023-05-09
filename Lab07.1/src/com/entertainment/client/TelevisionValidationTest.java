package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(0); // should stick
        System.out.println(tv); // volume should be 0

        tv.setVolume(100); // should stick
        System.out.println(tv); // volume should be 100

        tv.setVolume(-1); // error message, volume not set
        tv.setVolume(101); // error message, volume not set

        System.out.println(tv); // should still have volume 100, from before
        System.out.println();


        tv.setBrand("Samsung"); // should stick
        System.out.println(tv); // brand should be Samsung

        tv.setBrand("LG"); // should stick
        System.out.println(tv); // brand should be LG

        tv.setBrand("Sony"); // should stick
        System.out.println(tv); // brand should be Sony

        tv.setBrand("Toshiba"); // should stick
        System.out.println(tv); // brand should be Toshiba

        tv.setBrand("INVALID"); // error message, brand not set
        System.out.println(tv); // should still be Toshiba, from before
        System.out.println();
    }
}