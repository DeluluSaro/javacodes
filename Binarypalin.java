import java.util.Scanner;

public class Binarypalin {

    public static boolean isPalin(int num){

        int original=num;
        int reversed=0;

        while(num>0){
            int digi=num%10;
            reversed=reversed*10+digi;
            num/=10;
        }


        return original==reversed;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
       System.out.println(isPalin(num));
       sc.close();
    }
    
}
