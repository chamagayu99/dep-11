public class Demo16 {
    public static void main(String[] args) {
        
        /* 
            do{
                statement(s)
            }while(boolean expression);

            do statement while(boolean expression);
         */

        //  int x=0;
        //  do System.out.println("Hello"); while(x++<5);

         /*
             + + + + +
             + + + +
             + + +
             + +
             +
          */

          int a=0;
          do{
            int b=0;
          do {
            System.out.print("+ ");
          } while(b++<4-a);
          System.out.println();
         }while(a++<4);
    }
    
}
