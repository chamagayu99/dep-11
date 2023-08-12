public class Demo18 {
    public static void main(String[] args){

        byte a=-128;
        System.out.println(Integer.toBinaryString(a));
        int b=~a >>> 28;
        int c=b*2 + ++a;
        System.out.println(c);

        byte myByte=~0;
        int myInt=myByte>>(31-myByte);
        System.out.println(myInt);
        myInt=myInt<<1;
        System.out.println(myInt);

    }
    
}
