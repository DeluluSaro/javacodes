import java.util.Scanner;

class EulerPhi{

    public static int gcd(int a,int b){

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }

        return  a;
    }

    public static int givePhi(int n){
        int count=0;

        for(int i=0;i<=n;i++){
            if(gcd(n,i)==1){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int phi=givePhi(n);
        System.out.println(phi);





        sc.close();
    }

    
}