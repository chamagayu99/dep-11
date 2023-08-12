public class Demo2{
    public static void main(String[] args){

        String myStr="IJSE";
        int myInt=10;
        double myDouble=25.7855;

        /* we can inject any data type inside a string place holder */
        System.out.printf("| %s |\n",myStr);
        System.out.printf("| %s |\n",myInt);
        System.out.printf("| %s |\n",myDouble);
        System.out.println();

        /*we can specify the width with any data type */
        System.out.printf("| %6s |\n",myStr);
        System.out.printf("| %6d |\n",myInt);
        System.out.printf("| %6.2f |\n",myDouble);
        System.out.println();

        /*we can specify the flag "-" (which stands for left align) with any data type */
        System.out.printf("| %-6s |\n",myStr);
        System.out.printf("| %-6d |\n",myInt);
        System.out.printf("| %-6.2f |\n",myDouble);
        System.out.println();

        /* we can specify the flag "+" (which stands for negative/positive sign ) with only numeric data types(floats,decimal,etc)*/
        System.out.printf("| %+-6d |\n",myInt);
        System.out.printf("| %+-6.2f |\n",myDouble);
        System.out.println();

        /* we can specify the flag "0" (which stands for zero padding) with only numeric data types(floats,decimal,etc) */
        System.out.printf("| %+07d |\n",myInt);
        System.out.printf("| %+07.2f |\n",myDouble);
        System.out.println();

        /* we can specify the flag "," (which stands for thousand grouping) with only numeric data types(floats,decimal,etc) */
        System.out.printf("| %+0,10d |\n",125000);
        System.out.printf("| %+0,10.2f |\n",1232.222);
        System.out.println();

        System.out.printf("%s-%s\n",myInt,myStr);
        System.out.printf("%2$s-%1$s\n",myInt,myStr);
        System.out.printf("+%5s+%1$10s+ \n","A");



        

        
    

    }
}