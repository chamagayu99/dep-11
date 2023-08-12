import java.util.Scanner;

public class Demo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
       //switch can use with follows:
       //byte,short,char,int
       //Byte,Short,Character,Integer
       //String,Enum

       //✅switch -> if
       //❌if -> switch

       /*
        * switch(expression){
            switchLabel1:
            switchLabel2:
            switchLabel3:
            default:
        }
        */

        System.out.print("Enter your grade:");
        char grade=scanner.nextLine().strip().charAt(0);

        // if(grade=='A') System.out.println("DP");
        // else if(grade=='B') System.out.println("CP");
        // else if(grade=='C') System.out.println("P");
        // else if(grade=='W') System.out.println("F");
        // else System.out.println("Invalid grade");

        final int myGrade=60;
        switch(grade+1){
            case myGrade+5:
            System.out.println("DP"); 
            break;
            case 60+6:
            System.out.println("CP"); 
            break;
            case 'C':
            System.out.println("P"); 
            break;
            case 'W':
            System.out.println("F"); 
            break;
            default:
            System.out.println("Invalid grade");
        }
        System.out.println("just after switch statement");

    }
    
}
