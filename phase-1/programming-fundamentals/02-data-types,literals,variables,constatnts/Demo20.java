public class Demo20 {
    
    public static void main(String[] args){

        //(primitive(simple) | reference(complex))data type-> string

        int x=10;
        String myStr=x+"";

        boolean myBool=false;
        String myStr2=myBool+"";

                //string -> primitive data type

                /*wrappers
                 * ----------
                 * *Byte.valueOf(String) -> byte
                 * Short.valueOf(String) -> short
                 * "String".CharAt(index) -> char
                 * Integer.valueOf(String) -> int
                 * Long.valueOf(String) -> long
                 * Float.valueOf(String) -> float
                 * Double.valueOf(String) -> double
                 */

                 String myStr3="10";
                 byte myByte=Byte.valueOf(myStr3);
                 
                 String myStr4="10.25";
                 double myDouble=Double.valueOf(myStr4);

                 char myChar="ABC".charAt(0);
                 System.out.println(myChar);

                 String myStr5="354641841565";
                 long myLong = Long.valueOf(myStr5);
                 System.out.println(myLong);


    }
}
