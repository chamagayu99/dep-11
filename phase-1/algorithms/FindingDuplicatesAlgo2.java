import java.util.Scanner;

public class FindingDuplicatesAlgo2 {
        private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
     String usrInput;
    
    do{

        do{
        System.out.print("Enter a text:");
        usrInput=scanner.nextLine().strip();
        }while(usrInput.isBlank());

        char[] charsArray=new char[usrInput.length()];
        charsArray=usrInput.toUpperCase().toCharArray();
        //System.out.println(charsArray.length);

        int count=0;

        loop:
        for(int k=0; k<charsArray.length;k++){
            //if(charsArray[k]==' ') continue;

            for(int i=k,j=k+1; j<charsArray.length; j++){
                
                if(charsArray[i]==charsArray[j]){
                    count=++count;
                    charsArray[j]=' ';
                }

                if(count>0){
                    System.out.println(charsArray[i]+"-"+(count+1));
                    count=0;
                }else if(count==1){
                    System.out.println("no duplicates for "+charsArray[i]);
                    count=0;
                }
            };
        }
        
    }while(true);



    }
    
}
