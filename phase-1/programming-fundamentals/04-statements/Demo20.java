import java.util.Scanner;

public class Demo20 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // String name="";
        // do{
        //     System.out.print("Enter your Name:");
        //     name=scanner.nextLine();

            
        //     if(name.isBlank()){
        //         System.out.println("Name can't be empty");
        //     }
        // }while(name.isBlank());

        int sub=1;
        double tot=0;
        double avg=0;

        do{ 
            System.out.printf("Enter your marks for subject %s:",sub);
            tot= tot + scanner.nextInt();
            avg=tot/sub;
            scanner.nextLine();
            sub=++sub;
        }while(sub<4);
        System.out.printf("Total=%s \n",tot);
        System.out.printf("Average=%.2f%% \n",avg);

    }
    
}
