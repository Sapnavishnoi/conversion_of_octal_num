public class OctalToDecimal
{
    public static void main(String args[])
    {
        int octalnumber =Integer.parseInt(args[0]);
        int decimalnumber=0, exponent=0;

        while(octalnumber != 0)
        {
            decimalnumber = decimalnumber + getAnInt(octalnumber) * getPow(exponent);
            exponent++;
            octalnumber = getOctnum(octalnumber);
        }

        System.out.println(decimalnumber);
    }

    private static int getOctnum(int octalnumber) {
        return octalnumber/10;
    }

    private static int getPow(int exponent) {
        return (int) Math.pow(8, exponent);
    }

    private static int getAnInt(int octalnumber) {
        return octalnumber%10;
    }
}

