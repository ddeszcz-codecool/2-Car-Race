package main.java.com.codecool.car_race.util;

import java.util.Random;

public class RandomHelper {

    private static final Random RANDOM = new Random();

    private RandomHelper(){}

    public static int nextInt(int upper) {
        Random random = new Random();
        return random.nextInt(upper);
    }

    public static String chooseOne(String[] possibilities) {
        if (possibilities == null || possibilities.length < 1) {
            final String msg =
                    "Possibilities should be a non-empty array of strings.";
            throw new IllegalArgumentException(msg);
        }
        return possibilities[nextInt(possibilities.length)];
    }
}
