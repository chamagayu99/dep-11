public class Demo13 {
    public static void main(String[] args) {
        
        /*loops */

        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");

        /*while(boolean expression) statement;

        while(boolean expression){
            statemen(s)...
        }
        */
        int x=0;
        boolean flag=true;
        while(flag) {
            System.out.println("Hello");
            x++;
            if(x==5) flag = false;
        }

        int y=0;
        while(y++ <5){
            System.out.println("Hello world");
        }

        int z=0;
        while(y<5){
            System.out.println("Hello------------");
            z++;
        }

        int r=0;
        while(true){
            System.out.println("hiiiiiiiiiiiiiiiiiiiiii");
            if(++r==5) break;
        }

        // System.out.println("loops-1");
        // System.out.println("loops-2");
        // System.out.println("loops-3");
        // System.out.println("loops-4");
        // System.out.println("loops-5");

        int a=1;
        while(a<=5){
            System.out.println("loops-"+ ++a);
        }



    }
    
}
