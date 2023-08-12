public class Demo26 {

    public static void main(String[] args){

        //conditional AND &&
        //logical AND &

        //conditional OR ||
        //logical OR |

        int x=10;
        int y=5;

        boolean result1 = x==10 & y<10; //true & true
        System.out.println(result1);
        boolean result2 = x==10 && y<10; //true & true
        System.out.println(result2);

        System.out.println("-------------------");

        boolean result3= x==20 & y<10; //false & true
        System.out.println(result1);
        boolean result4 = x==20 && y<10; //false & true
        System.out.println(result2);

        System.out.println("-----------------------");

        boolean result5= x==10 & y>10; //true & false
        System.out.println(result1);
        boolean result6 = x==10 && y>10; //true & false
        System.out.println(result2);


    }
    
}
