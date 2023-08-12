import java.util.Scanner;

public class LinearSearchAlgo2 {
        private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        
        String[] names={"Kasun","Nuwan","Ruwan","supun","Upul","Nimal"};

        do{

            System.out.print("Enter a name to search:");
            String search=scanner.nextLine();

            boolean found=false;
            for(int i=0; i<names.length; i++){
                if(search.equalsIgnoreCase(names[i])){
                    System.out.println("Found at index "+i);
                    found=true;
                    break;
                }
            };

            if(!found) System.out.println("Not Found");

        }while(true);

    }
    
}
