import java.util.Scanner;

public class Demo8 {

        private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        /*syntax 1:
         * if (boolean expression) statement;
         * 
         * syntsx2:
         * if (boolean expression) statement;
         * 
         * [
         * else if (boolean expression) statement;
         * else if (boolean expression) statement;
         * ....
         * ]
         * 
         * [else statement;]
         * 
         * syntax3:
         * if (boolean expression) {
         *  statement(s);
         * 
         * .....
         * }
         * 
         * syntax4:
         * if (boolean expression) {
         * statement(s);
         * 
         * .....
         * }[else if (boolean expression){
         * statement(s);
         * }else{
         * 
         * }]
         */

         System.out.print("Enter your name:");
         String name=scanner.nextLine();

         //bad practise
        //  if (name.length()>0) 
        //  System.out.printf("name=%s \n",name);

        if (name.length()>0) System.out.printf("name=%s \n",name);
        else System.out.println("Invalid name");

        System.out.println("-----------------------");


    }
    
}
