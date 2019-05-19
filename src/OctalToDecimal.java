import java.sql.SQLOutput;
import java.util.*;

public class OctalToDecimal {
    public static void main(String args[]){
        String number=args[0];
        int length =number.length();
        int decimalnumber=0, exponent=8;
        //validation
        if(validation(number)){
            System.out.println("invalid");
        }
        else{
        for (int digit:elementMultiplication(getDigit(number),getPow(length,exponent))) {
            decimalnumber+=digit;
        }
        System.out.println(decimalnumber);
    }}

    private static boolean validation(String number) {
        return number.contains("8")||number.contains("9");
    }

    private static List<Integer> getPow(int length,int exponent) {
        ArrayList<Integer>powerseries=new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            int power=((int)Math.pow(exponent,i));
            powerseries.add(power);
        }   return powerseries;
    }

    private static List<Integer> getDigit(String Number){
        String [] usernumber=Number.split("");
        ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i =usernumber.length; i>0 ; i--) {
             list.add(Integer.valueOf(usernumber[i-1]));
        } return list;
    }
    private static List<Integer>elementMultiplication(List<Integer>digit,List<Integer>powerseries){
          ArrayList<Integer>product=new ArrayList<Integer>();
        for (int i = 0; i <digit.size() ; i++) {
              product.add(digit.get(i)*powerseries.get(i));
        }return product;
    }
 }

