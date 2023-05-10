package src.com.entertainment.client;

import src.com.entertainment.InvalidVolumeException;
import src.com.entertainment.Television;

class TelevisionClient {
    public static void main(String[] args) {
        try {
            Television tv1 = new Television("Samsung", 32);
            System.out.println(tv1);    // toString() is called
        }
        catch(InvalidVolumeException e) {
            e.printStackTrace();
        }

    }
}