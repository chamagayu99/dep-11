public class Demo14 {
 public static void main(String[] args){

    final int MY_CONST=10;
    final int MY_CONST2=10 * (int) Math.random();

    byte myByte=10; //✅value bits(7)=(int)value bits(31)
    //byte myByte=128; //✅out of the range
    byte myByte2=MY_CONST; //✅compile time constant
    //byte myByte3=MY_CONST2; //✅runtime constant

    short myShort2=355; //✅value bits(15)=(int)value bits(31)

    char myChar2=65; //✅value bits(16)=(int)value bits(31)
    //char myChar2=-65; //✅out of the range

    final short myShort=65;
    final short myShort3=-65;

    char myChar4=myShort; //value bits(16)=(byte)value bits(15)
    //char myChar5=myShort2; //variable
    //char myChar6=myShort3; //out of range
    //char myChar7=myByte; //not a compile time constant

    System.out.println(1250); //❓ by default int(32 bits)
    System.out.println(12.25); //❓ by default double(64 bits)

    // final long MY_LONG_CONST=65;
    // int myInt5=MY_LONG_CONST;
    // short myShort5=MY_LONG_CONST;
    // byte myByte5=MY_LONG_CONST;

    final int MY_INT_CONST=65;
    int myInt5=MY_INT_CONST;
    short myShort5=MY_INT_CONST;
    byte myByte5=MY_INT_CONST;

    final short someCrazyShort=65;
    char myChar=someCrazyShort;

    long myLong=myByte;
    float myFloat6=myLong; //✅value bits(31)=(Long)value bits(63)

    int someInt=555;
    long myLong7=someInt;

    long mylong6=122222222222258l; //✅


 }
}
