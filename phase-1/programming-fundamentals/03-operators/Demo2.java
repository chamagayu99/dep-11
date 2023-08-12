public class Demo2 {
    public static void main(String[] args){

        int x=1;
        int y=2;

        int result= ++x + ++y + x - y + x++ - --y;
        System.out.println(result);
        result=result+ x++ + y--;
        System.out.println(result);
        result=x + result +y;
        System.out.printf("result=%s, x=%x, y=%s \n",result,x,y);

    }
    
}
