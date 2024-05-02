package project.bdd.utility;

import java.util.Random;

public class RandomEmailGenerator {
    public static String randomEmail() {
        String emailPrefix = "hejaz";
        int randomNumber = new Random().nextInt(1000);
        return emailPrefix + "_" + randomNumber + "@yahoo.com";
    }

}
