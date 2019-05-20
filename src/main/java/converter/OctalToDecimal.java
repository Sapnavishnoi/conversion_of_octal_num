package main.java.converter;

public class OctalToDecimal {
    public static void main(String args[]){
        String number=args[0];
        int length =number.length();
        int decimalnumber=0, exponent=8;
        if(IsOctalnumberOrNot(number)){
            System.out.println("invalid");
        }
        else{

        System.out.println(DotProduct.dotProduct(GetDigits.getDigits(number), GetPow.getPower(length,exponent)));
    }}


    private static boolean IsOctalnumberOrNot(String number) {
        return number.contains("8")||number.contains("9");
    }
}

