package se.lexicon.domas;

public class App 
{
    public static void main( String[] args )
    {
        byte myByte = 25;
        short myShort = 10000;
        int myInteger = 11_000_000;
        long longTotal = (50_000L + 10L * (myByte + myShort + myInteger));
        System.out.println(longTotal);

        short shortTotal = (short) (50_000 + 10 * (myByte + myShort + myInteger));
    }
}
