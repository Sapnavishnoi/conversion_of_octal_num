package main.java.converter;

import java.util.ArrayList;
import java.util.List;

public class GetPow {
    public static List<Integer> getPower(int length, int exponent) {
        ArrayList<Integer> powerseries=new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            int power=((int)Math.pow(exponent,i));
            powerseries.add(power);
        }   return powerseries;
    }
}
