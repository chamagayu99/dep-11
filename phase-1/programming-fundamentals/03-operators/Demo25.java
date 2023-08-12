public class Demo25 {
    public static void main(String[] args){

        boolean flag1=5>2; // true
        boolean flag2=10<5; // flase
        boolean flag3="ijse".length()==5; // false
        boolean flag4="ijse".length()==4; // true

        System.out.println(flag1 & flag4);
        System.out.println(flag2 & flag3);
        System.out.println(flag1 & flag2);
        System.out.println("-----------------------");
        System.out.println(flag1 | flag4);
        System.out.println(flag2 | flag3);
        System.out.println(flag1 | flag2);
        System.out.println("-----------------------");
        System.out.println(flag1 ^ flag4);
        System.out.println(flag2 ^ flag3);
        System.out.println(flag1 ^ flag2);
    }
    
}
