public class Demo4 {
    public static void main(String[] args) {
        
        abc:
        System.out.println("Hello");

        myBlock:
        {
        System.out.println("Welcome");
        System.out.println("to");

        if (true) break myBlock;

        // unreachable statements
        System.out.println("DEP-10");
        }

        System.out.println("DEP-11");

        //local variable declaration statement
        int x;

        //local constatnt declaration statement
        final int y;
    }
    
}
