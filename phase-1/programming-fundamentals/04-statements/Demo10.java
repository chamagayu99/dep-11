import java.util.Scanner;

public class Demo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the year:");
        int year=scanner.nextInt();
        scanner.nextLine();


       
        int feb=0;
        
        switch(year%4){
            case 0:
                System.out.println("this is a leap year");
                feb=29;
                break;
            default:
                System.out.println("this is not a leap year");
                feb=28;
        }

        System.out.println(feb);
        System.out.print("Enter the month:");
        String month=scanner.nextLine().strip().toUpperCase();

        int remain=0;
        
        switch(month){
            case "1": case "JAN" : case "JANUARY":
            remain+=31;
            case "2": case "FEB" : case "FEBRUARY":
            remain+=feb;
            case "3": case "MAR" : case "MARCH":
            remain+=31;
            case "4": case "APR" : case "APRIL":
            remain+=30;
            case "5": case "MAY" :
            remain+=31;
            case "6": case "JUN" : case "JUNE":
            remain+=30;
            case "7": case "JUL" : case "JULY":
            remain+=31;
            case "8": case "AUG" : case "AUGHUST":
            remain+=31;
            case "9": case "SEP" : case "SEPTEMBER":
            remain+=30;
            case "10": case "OCT" : case "OCTOBER":
            remain+=31;
            case "11": case "NOV" : case "NOVEMBER":
            remain+=30;
            case "12": case "DEC" : case "DECEMBER":
            remain+=31;
            break;
            default:
            System.out.println("Invalid month");
            System.exit(1);
        }
        System.out.println(remain);
        

    }
    
}
