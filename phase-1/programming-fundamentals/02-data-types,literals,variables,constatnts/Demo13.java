public class Demo13{
    public static void main(String[] args){
       
    byte myByte=10; //❓value bits(7)=(int)value bits(31)
    short myShort=myByte;
    short myShort2=355; //❓ value bits(15)=(int)value bits(31)

    char myChar='A';
    char myChar2=65; //❓ value bits(16)=(int)value bits(31)
    //myShort=myChar; //✅value bits(15)=(char)value Bits(16)

    //myChar=myShort; //❓value bits(16)=(short)value bits(15)
    //myChar=myByte; //❓ value bits(16)=(byte)value bits(7)

    int myInt=myByte;
    int myInt2=myShort;
    int myInt3=myChar;

    int myLong=myByte;
    int myLong2=myShort;
    int myLong3=myChar;
    int myLong4=myInt;

    //float myFloat=0.2; //✅value bits(15)=(double)value Bits(16)
    float myFloat=0.2f;
    double myDouble=myFloat;

    float myFloat2=myInt;
    float myFloat3=myChar;
    float myFloat4=myShort;
    float myFloat5=myByte;
    float myFloat6=myLong; // ❓ value bits(31)=(Long)value bits(63)

    double myDouble2=myLong;
    double myDouble3=myInt;
    double myDouble4=myChar;
    double myDouble5=myShort;
    double myDouble6=myByte;





    }
}