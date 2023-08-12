public class Demo3 {
    public static void main(String[] args){

        int x=5;
        int y=x;

        y= y++ + ++x + x++ + - y + x-- + -x--;
        System.out.println(y);
        System.out.println(x);
        x=x++ + ++y + 2 + y-- + - x-- + x++;
        System.out.println(x);
        int result=x++ - --y;
        System.out.printf("result=%s, x=%s, y=%s",result,x,y);


    }
    
}
