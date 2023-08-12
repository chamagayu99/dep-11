public class Demo3{
    public static void main(String[] args){

        int id=1;
        String name="Kasun Sampath";
        System.out.printf("ID=C%04d,Name=%s \n",id,name);

        String formattedString=String.format("ID=C%04d,Name=%s \n",id,name);
        System.out.println(formattedString);


    }
}