package main.java.converter;

import java.util.ArrayList;
import java.util.List;
public class ElementMultiplication {

    public static List<Integer> elementMultiplication(List<Integer>a, List<Integer>b){
        ArrayList<Integer> product=new ArrayList<Integer>();
        for (int i = 0; i <a.size() ; i++) {
            product.add(a.get(i)*b.get(i));
        }return product;
    }
}
