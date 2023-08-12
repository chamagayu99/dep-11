import java.util.Scanner;

public class Demo7 {

    private static final Scanner scanner = new Scanner(System.in); //easy way to System.in

    public static void main(String[] args) {
        
        //standard output -> screen -> System.out
        //standard error -> screen  -> System.err
        //standard input -> keyboard-> System.in

        // System.out.println("IJSE");
        // System.err.println("Hello");

        System.out.print("Enter Your name:");
        String name=scanner.nextLine();
        System.out.printf("Hi! Welcome %s \n",name);

        System.out.print("Enter Your age:");
        int age=scanner.nextInt();
        System.out.printf("Your age is %s \n",age);

       // scanner.nextDouble();
    }
    }


    

