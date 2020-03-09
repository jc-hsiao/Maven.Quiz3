package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        //String newS = str.replaceAll("[^a-zA-Z0-9]", "");
        String s = str.toLowerCase();

        //String[] arr = new String[newS.length()];
        ArrayList<String> waves = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char[] c = s.toCharArray();
            if(!Character.isLetter(s.charAt(i)))
                continue;
            char big = Character.toUpperCase(s.charAt(i));
            c[i] = big;
            String wave = new String(c);
            waves.add(wave);
        }

        return waves.toArray(new String[0]);
    }
}
