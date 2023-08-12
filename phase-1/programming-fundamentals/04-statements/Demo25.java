import java.util.Scanner;

public class Demo25 {
        private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        
        System.out.print("Enter your name:");
        String name=scanner.nextLine();

        String str1=String.format("Hello %s...", name);
        String str2="Welcome to DEP-10...";
        String str3="We are born to code...";

        String str=str1;
        for(int i=0;i<20;i++){
            System.out.printf("%s","\b".repeat(100)); 
            System.out.print(str1); 
            System.out.printf("%s","\b".repeat(str1.length())); 
            Thread.sleep(1000);   
            System.out.print(str2); 
            System.out.printf("%s","\b".repeat(str2.length())); 
            Thread.sleep(1000);   
            System.out.print(str3); 
            System.out.printf("%s","\b".repeat(str3.length())); 
            Thread.sleep(1000);          
        }
    }
    
}
