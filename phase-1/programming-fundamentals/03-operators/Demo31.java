public class Demo31 {

    public static void main(String[] args) {
        
        int a=2;
        int b=3;
        int c=4;
        int d= a++ < (c - 2) && b==3 ? (a =  a++ + c) + b : (a= ++a + b) + (b=++a + c) - (++c - 2); 
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

    }
    
}
