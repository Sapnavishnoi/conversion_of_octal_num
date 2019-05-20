package main.java.converter;

import java.util.ArrayList;
import java.util.List;

public class GetDigit {
    public static List<Integer> getDigit(String Number){
        String [] usernumber=Number.split("");
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i =usernumber.length; i>0 ; i--) {
            list.add(Integer.valueOf(usernumber[i-1]));
        } return list;
    }
}
