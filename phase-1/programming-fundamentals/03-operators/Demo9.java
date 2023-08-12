public class Demo9 {

    public static void main(String[] args){

        String myStr1="Hello";
        String myStr2="World";
        int myInt1=10;
        int myInt2=1;
        char myChar='!';

        int hhh=myChar;
        System.out.println(hhh);

        int myInt3=myInt1 + myChar; // output->int
        String myStr=myStr1 + " " + myStr2 + " " + myInt1 + myInt2 + myChar; // output->String
        System.out.println(myStr);
        String result = myInt1+ myInt2 +  " " + myStr1;
        System.out.println(result);
        String result2 =  " " +  myInt1+ myInt2 + myStr1;
        System.out.println(result2);
        System.out.println(myInt1+myInt2+ myChar+ " "+ 10+12);
        System.out.println(myInt1+myInt2+ myChar+ " "+ (10+12)+myChar);

        //java 11

        System.out.println(myStr1
                                .concat(" ")
                                .concat(myStr2)
                                .concat(" ")
                                .concat(myInt1+"")
                                .concat(" ")
                                .concat(myInt2+" ")
                                .concat(myChar+" "));


    }
    
}
