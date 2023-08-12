public class Demo1 {
    public static void main(String[] args) {
        
        String s="          ";
        System.out.println(s.length());
        System.out.println(s.strip().length());
        System.out.println(s.isBlank()); // strip()+length=0
        System.out.println(s.isEmpty());//length=0


        String something="Hello There";
        String sub=something.substring(2, 5);
        System.out.println(sub);
    }
    
}
