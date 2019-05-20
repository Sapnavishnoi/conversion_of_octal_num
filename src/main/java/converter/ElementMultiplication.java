package main.java.converter;

import java.util.ArrayList;
import java.util.List;
public class ElementMultiplication {

    public static List<Integer> elementMultiplication(List<Integer>digit, List<Integer>powerseries){
        ArrayList<Integer> product=new ArrayList<Integer>();
        for (int i = 0; i <digit.size() ; i++) {
            product.add(digit.get(i)*powerseries.get(i));
        }return product;
    }
}
