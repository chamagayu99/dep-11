public class Demo4 {

    public static void main(String[] args) {

        String something="IJSE";

        int x=10;
        int y;
        long myLong =20;

        int[] myArray=new int[5];
        
        int[] myArray2=myArray;

        System.out.println(myArray);
        System.out.println(myArray2);
        System.out.println(myArray.toString());

        System.out.println("=================");

        System.out.println(something);
        System.out.println(something.toString());

        System.out.println("=================");


        Demo4 ref=new Demo4();
        System.out.println(ref);
        System.out.println(ref.toString());

        
    }
}
