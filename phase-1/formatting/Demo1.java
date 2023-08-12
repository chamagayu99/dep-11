public class Demo1{
    public static void main(String[] args){

        final int id1=1;
        String name1="Kasun Sampath";
        double avgMarks1=75.25;

        final int id2=2;
        String name2="Nuwan Ramindu";
        double avgMarks2=62.2225;

        final String LINE="+%6s+%1$15s+%1$6s+\n";
        final String RECORD="|SK-%03d|%-15s|%6.2f|\n";

        System.out.printf(LINE,"");
        System.out.printf(RECORD,id1,name1,avgMarks1);
        System.out.printf(LINE,"");
        System.out.printf(RECORD,id2,name2,avgMarks2);
        System.out.printf(LINE,"");



    }
}