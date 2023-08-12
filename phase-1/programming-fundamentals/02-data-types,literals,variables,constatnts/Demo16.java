import java.util.Calendar;

public class Demo16 {
    public static void main(String[] args){

        byte myByte=10; //implicit narrow primitive  conversion

        final int myInt=10;
        byte myByte2=myInt; //implicit narrow primitive  conversion

        int myInt2=10;
        //byte myByte3=myInt2;
        byte myByte3=(byte)myInt2;//explicit narrow primitive  conversion
        System.out.println(myByte3);

        //byte myByte4=256; 
        byte myByte4=(byte)256; 
        System.out.println(myByte4);

        //byte myByte5=(byte) (5>2);
        byte myByte6=(byte) (10+250);
        //byte myByte7=(byte) "abc";

        Object a=10;
        int myByte8=(int) a;
        System.out.println(myByte8);

        Object b="abc";
        byte myByte9=(byte) b;

        Calendar c = Calendar.getInstance();
        //byte myByte10=(byte) c;

        
        

    }
    
}
