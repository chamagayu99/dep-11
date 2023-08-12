public class Demo24 {

    public static void main(String[] args) throws Exception{
        
        String chars="|/-\\|/-\\";
        String red= "\033[41;1m";
        String reset= "\033[30;0m";

        System.out.print("Loading");
    
        for(int i=0;i<chars.length();i++){
            System.out.print("(");
            System.out.printf("%s",chars.charAt(i));
            System.out.print(")");
            Thread.sleep(500);
            System.out.print("\b".repeat(3));
            if((i+1)==chars.length()) i=-1;
        }

        for(int x=0,num=70; x<20 ;x++){
            System.out.println("-----------");
            System.out.print("\b".repeat(23));
            System.out.print("[");
            System.out.printf("%s%s%s%s",
                red," ".repeat(x), reset,
              " ".repeat(20-x));
            System.out.print("] ");
            //precentage = String.format("%.2f%%", x / 20.0 * 100);
            
            if (x / 20.0 * 100 >= num){
                //precentage = String.format("%.2f%%", num * 1.0);
                //System.out.println(precentage);
                break;
            }
            
            //System.out.print(precentage);
            Thread.sleep(500);
        }



    }
    
}
