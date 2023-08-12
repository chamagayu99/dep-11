import java.util.Scanner;

public class Demo21 {
        private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        // int x=0;
        // do{
        //     System.out.println(x);
        //     Thread.sleep(2000);
        // }while(x++<4);

        //System.out.println("Hello there\b\b\b\b\b\btest");
        // System.out.println("Test\b");
        // System.out.println("Test\bABC");

        int number=0;
        int option=0;
        boolean flag1=true;
        boolean flag2=true;

        String red= "\033[41;1m";
        String reset= "\033[30;0m";
      
        do{
            System.out.print("Enter a number between(0-100):");
            number=scanner.nextInt();
            scanner.nextLine();

            if(number<0 || number>100){
                System.out.println("Invalid Number");
            }else {
                flag1=false;
                do{
                    System.out.println("Select an option");
                    System.out.println("1.Fast");
                    System.out.println("2.Medium");
                    System.out.println("3.Slow");
                    option=scanner.nextInt();
                    scanner.nextLine();

                    if(option>3 || option<1){
                        System.out.println("Invalid option");
                    }else{
                        flag2=false;
                        int sleep=0;
                        if(option==1){
                            sleep=200;
                        }else if(option==2){
                            sleep=1000;
                        }else{
                            sleep=1500;
                        }

                        int x=0;
                        String percentage="";
                        do{
                            System.out.print("\b".repeat(22+percentage.length()));
                            System.out.print("[");
                            System.out.printf("%s%s%s%s",red," ".repeat(x),reset," ".repeat(20-x));
                            System.out.print("]");
                            percentage=String.format(" %.2f", x/20.0*100);
                            System.out.printf(percentage);
                            Thread.sleep(sleep);
                        }while(x++<20);
                        System.out.println();
                    }
                }while(flag2);



            }
        }while(flag1);
    }
    
}
