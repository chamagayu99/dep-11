public class Demo14 {
    public static void main(String[] args) {
        
        /*
             + + + + +
             + + + + +
             + + + + +
             + + + + +
             + + + + +
         */

         int a=5;
         int b=0;

        //  while(b<5){
        //     System.out.println("+ ".repeat(a));
        //     b++;
        //  }

        int y=0;

            while(y++<5){
                int x=0;
                while(x<5){
                    System.out.print("+ ");
                    x++;
                }
                System.out.println();
            }

            int z=0;
            while(z++<25){
                System.out.print("+ ");
                if(z%5==0) System.out.println();
            }
    }
    
}
