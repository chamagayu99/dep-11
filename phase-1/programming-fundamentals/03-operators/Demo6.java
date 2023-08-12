public class Demo6 {

    public static void main(String[] args){

        float myFloat=2.23f;
        myFloat=myFloat++;
        System.out.println(myFloat);
        myFloat++;
        System.out.println(myFloat);
        System.out.println(--myFloat);

        /* you can use the bitwise complement operator only with integer data types */
        float myFloat2=5.25f;
        //System.out.println(~myFloat2);

        byte myByte=5;
        myByte=(byte) ~myByte; // int-> byte casting

    }
    
}
