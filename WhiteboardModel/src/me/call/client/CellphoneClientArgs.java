package me.call.client;

import me.call.Brand;
import me.call.CellPhone;

import java.util.Arrays;

class CellphoneClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java me.call.client.CellphoneClientArgs <brand> <volume> <display>";
            String example = "Example: java me.call.client.CellphoneClientArgs Samsung Black 6.0";
            String note1 = "Note: supported brands are " + Arrays.toString(Brand.values());
            String note2 = "Supported colors are Black, White, Red, Blue, Green, Yellow.";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;  // early return from main(), application exits
        }

        System.out.println("You provided " + args.length + " arguments");

        // Step 1: convert to proper type
        Brand brand = Brand.valueOf(args[0].toUpperCase());
        String color = args[1];
        double screenSize = Double.parseDouble(args[2]);

        // Step 2: Create instance
        CellPhone cellPhone = new CellPhone(brand, color, screenSize);

        System.out.println("Congratulations on your order, it will arrive soon.");
        System.out.println(cellPhone);
    }
}