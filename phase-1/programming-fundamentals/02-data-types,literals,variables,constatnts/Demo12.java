public class Demo12{
    public static void main(String[] args){
        int id1=1;
        String name1="Kasun";
        String address1="Galle";

        int id2=2;
        String name2="Nuwan";
        String address2="Matara";

        String COLOR="\033[34;1m";
        String RESET="\033[35;0m";

        System.out.println("+-----+----------+----------+");
        //System.out.printf("|  %sID%s |   %sNAME%s   | %sADDRESS%s  | \n",COLOR,RESET,COLOR,RESET,COLOR,RESET);
        System.out.printf("|  %1$sID%2$s |   %1$sNAME%2$s   | %1$sADDRESS%2$s  | \n",COLOR,RESET);
        System.out.println("+-----+----------+----------+ ");
        System.out.printf("|  %s  |  %s   |  %s   | \n|  %s  |  %s   |  %s  | \n",id1,name1,address1,id2,name2,address2);
        System.out.println("+-----+----------+----------+");
       
        


    }
}