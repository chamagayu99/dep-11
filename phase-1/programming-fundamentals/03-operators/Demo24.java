public class Demo24 {

    public static void main(String[] args){

        int result1=5&2;
        System.out.println(result1);

        byte result2=(byte) (-2 & 0xFF);
        System.out.println(result2);

        byte result3=0x2 | 0xA;
        System.out.println(result3);

        byte result4= 011 ^ 5;
        System.out.println(result4);

        final byte x=10;
        final byte y=20;
        byte z=x+y;

        int abc=10;
        long l=15;
        //int result=abc+l;
        long result=abc+l;

        int x1=10;
        float f=10f;
        //float result=x1+f;

        float f1=10f;
        double d=25;
        //double result=f1+d;

        //float result6=x+x1+f+l+d;
        double result6=x+x1+f+l+d;


    }
    
}
