import java.util.Scanner;

class Seive{

    public static boolean isPrime(int gosu){


        if(gosu<2){
            return false;
        }

        for(int i=2;i<=gosu-1;i++){
            if(gosu % i ==0){
                return false;


            }
        }

        return true;

    }
    public static void main(String[] args) {


        int ni;

        Scanner sc=new Scanner(System.in);

        ni=sc.nextInt();

        for(int i=1;i<=ni;i++){

            if(isPrime(i)){
                System.out.println(i);
            }

        }

        sc.close();

        
    }
}