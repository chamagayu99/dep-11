public class Demo18 {
    public static void main(String[] args){

        short myShort=-10;
        char myChar=(char)myShort;

        short myShort2=(short)myChar;
        System.out.println(myShort2);

        byte myByte=(byte)myChar;
        System.out.println(myByte);

        int myInt=(int)myChar;
        System.out.println(myInt);

        long myLong=(long)myChar;
        System.out.println(myLong);


    }
}
