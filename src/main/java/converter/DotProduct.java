package main.java.converter;

import java.util.ArrayList;
import java.util.List;
public class DotProduct {

    public static int dotProduct(List<Integer>a, List<Integer>b){
        int total=0;
        for (int i = 0; i <a.size() ; i++) {
            total+=a.get(i)*b.get(i);
        }return total;
    }
}
