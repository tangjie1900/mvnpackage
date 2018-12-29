package cn.saylife.mvncommon;

import java.util.Random;

public class RandomNameUtil {

    private static final String ORIGIN = "qwertyuiopasdfghj";

    public static String randomName() {
        Random random = new Random();
        String name = "";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(ORIGIN.length());
            name += (ORIGIN.charAt(index
            ) + "");
        }
        return name;
    }
}
