public class Demo15 {

    public static void main(String[] args){

        byte myByte=10;
        int myInt=myByte>>>2;
        System.out.println(myInt);
        String binaryRep= String.format("%32s\n",Integer.toBinaryString(myInt))
                                .replaceAll(" ", "0");
        System.out.println(binaryRep);

        System.out.println("------------------------------");

        byte myByte2=-127;
        int myInt2=myByte2>>>2;
        System.out.println(myInt2);
        String binaryRep2= String.format("%32s\n",Integer.toBinaryString(myInt2))
                                .replaceAll(" ", "0");
        System.out.println(binaryRep2);


    }
    
}
