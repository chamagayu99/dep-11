public class Demo10{
    public static void main(String[] args){
        
        String someString="This\t\tis a string";
        System.out.println(someString);
        String someString2="This is an\b string";
        System.out.println(someString2);
        String someString3="This is awesome\rwhat the heck?";
        System.out.println(someString3);
        String someString4="This is a multiline\n\rline string in windows";
        System.out.println(someString4);
        String someString5="This is a multiline\n\r line string in other operating systems";
        System.out.println(someString5);
        String someString6="what if I want to print just \\ <- this";
        System.out.println(someString6);
        String someString7="what if I want to print just \" <- this";
        System.out.println(someString7);

    }
}