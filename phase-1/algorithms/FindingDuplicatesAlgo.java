import java.util.Scanner;

public class FindingDuplicatesAlgo {
            private final static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] nums={1,4,-5,6,55,8,4,50,20,-5,8,2,4,-5};  
        int[] dupArray=new int[nums.length];
        int j=0;

        do{

            System.out.print("Enter a number to find duplicates:");
            int search=scanner.nextInt();
            scanner.nextLine();
            
            for(int i=0; i<nums.length; i++){
                if(search==nums[i]){
                    dupArray[j]=i;
                    ++j;
                }
            };

            if(j==0){
                System.out.println(search+" does not exist in thenumber list");
            }

            if(j>1){
                System.out.println("Number of Duplicates found:"+j);
                System.out.print("Duplicates are found at:");
                for(int k=0;k<j;k++){
                    System.out.print(dupArray[k]+",");
                }
                j=0;
                dupArray=new int[nums.length];
            }
            System.out.println();

            if(j==1) {
                System.out.println("No Duplicates Found!");
                j=0;
            }

        }while(true);


    }
    
}
