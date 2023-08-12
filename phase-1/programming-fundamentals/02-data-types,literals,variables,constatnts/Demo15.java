    public class Demo15{
    
    public static void main(String[] args){
        byte myByte=10;
        int myInt=myByte;
        System.out.println(Integer.toBinaryString(myInt));
        int myInt2=Integer.valueOf(Integer.toBinaryString(myInt));
        System.out.printf("%032d \n",myInt2);

        byte myByte2=-25;
        System.out.println(Integer.toBinaryString(myByte2));

        final byte myByte3=10; //compile time constant
        final int myInt3=myByte3; //compile  time constant
        byte myByte4=myInt3;

        byte myByte5=10; //variable
        final int myInt4=myByte5; //run  time constant
        //byte myByte6=myInt4;

        final byte myByte7=(byte) Math.random(); //run time constant
        final int myInt7=myByte7; //run  time constant
        //byte myByte8=myInt7;


        final int myInt5=15; //compile time constant
        final int myInt6=15*(int) Math.random(); // run  time constant
    }
}