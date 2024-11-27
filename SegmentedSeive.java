import java.util.Scanner;

public class SegmentedSeive {

    public static boolean isPrime(int ibk){

        if(ibk<2){
            return false;
        }
        for(int i=2;i<=ibk-1;i++){
            if(ibk%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int strt,stp;
        Scanner sc=new Scanner(System.in);

        strt=sc.nextInt();
        stp=sc.nextInt();

        for(int i=strt;i<=stp;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
