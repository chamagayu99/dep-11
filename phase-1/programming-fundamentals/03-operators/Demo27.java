public class Demo27 {

    public static void main(String[] args){

        int x=5;
        int y=2;

        boolean result1= ++x == 5 & ++y < 5;
        System.out.println(result1);
        System.out.printf("x=%s \n",x);
        System.out.printf("y=%s \n",y);

        int a=5;
        int b=2;

        boolean result2= ++a == 5 && ++b < 5; 
        System.out.println(result1);
        System.out.printf("a=%s \n",a);
        System.out.printf("b=%s \n",b); // not  b evaluate




    }
    
}
