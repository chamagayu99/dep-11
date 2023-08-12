public class Demo{
    
    public static void main(String[] args) {

        //fixed /static arrays✅ (built in the language)
        //dynamic arrays ✅ (java SE library)

        String[] names=new String[5];
        names[0]="Kasun";
        names[0]="Nuwan";
        names[0]="Ruwan";
        names[0]="Suoun";
        names[0]="Upul";

        for(int i=0; i<5 ; i++){
            System.out.println(names[i]);
        }
        System.out.println(names.length);

        int k=0;
        for(int i=0; i<names.length; i++){
            if(names[i].startsWith("N")){k++;}
        }
        System.out.println(k);

        /*
         * new DataType[size];
         * 
         * new int[5]; int[]
         * new char[10]; char[]
         * new long[0]; long[]
         * new double[3]; double[]
         * new Calender[10]; Calender[]
         * 
         * in java, arrays are object
         * in java arrays are categorized into reference data types
         * 
         */

         /* datatype identifier; */

         int myInt;
         myInt=10;

         int[] myIntArray;
         myIntArray=new int[5];

         String[] myStringArray;
         myStringArray=new String[10];

        
    }
}