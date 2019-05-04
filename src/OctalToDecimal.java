import java.util.Scanner;

public class OctalToDecimal
{
    public static void main(String args[])
    {
        int octnum, decnum=0, exponent=0;
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter Octal Number : ");
        octnum = user_input.nextInt();

        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, exponent);
            exponent++;
            octnum = octnum/10;
        }

        System.out.print(decnum);
    }
}

