public class Demo6 {

    public static void main(String[] args) {

        // DataType[] identifier; ✅ (good practice)
        // DataType identifier[];
        // DataType [] identifier;
        // DataType []identifier;
        // identifier=new DataType[size];
        // identifier=new Datatype[]{value1,value2,value3};
        // identifier={value1,value2,value3};❌
        // DataType[] identifier={value1,value2,value3};

        
        int myInt;
        myInt=10;

        int[] myArray;
        myArray= new int[]{myInt,20,30,myInt,50};

        //myArray={1,2,3,4,5};

        int[] nums={1,2,3,4,myArray[myArray.length-1]};

        for(int i=0; i<nums.length; i++){

            myArray[i]=nums[i];

        };
        nums=null;

        for(int i=0; i<nums.length; i++){ //NullPointerException

            System.out.println(nums[i]);

        };

        for(int i=0; i<myArray.length; i++){

            System.out.println(myArray[i]);

        };

    }
    
}
