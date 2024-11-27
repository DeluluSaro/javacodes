import java.util.Scanner;
public class Strobro {

    public static boolean checkStn(String num){
         char[] map=new char[256];
         map['0']='0';
         map['6']='9';
         map['9']='6';
         map['8']='8';
         map['1']='1';

         int l=0;
         int r=num.length()-1;
         while(l<=r){

            char leftchar=num.charAt(l);
            char rightchar=num.charAt(r);

            if(map[leftchar]==0||map[leftchar]!=map[rightchar]){
                return false;
            }



            l++;
            r--;
         }
         
         

        return true;
    }
    public static void main(String[] args){
        String num;
        Scanner sc=new Scanner(System.in);

        num=sc.nextLine();
        boolean stobo=checkStn(num);

        System.out.println(stobo);

        sc.close();

    }
    
}
