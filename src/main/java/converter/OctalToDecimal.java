package main.java.converter;

public class OctalToDecimal {
    public static void main(String args[]){
        String number=args[0];
        int length =number.length();
        int decimalnumber=0, exponent=8;
        if(validation(number)){
            System.out.println("invalid");
        }
        else{
        for (int digit:ElementMultiplication.elementMultiplication(GetDigits.getDigits(number), GetPow.getPower(length,exponent))) {
            decimalnumber+=digit;
        }
        System.out.println(decimalnumber);
    }}


    private static boolean validation(String number) {
        return number.contains("8")||number.contains("9");
    }
}

