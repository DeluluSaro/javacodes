import java.util.Scanner;

class Joseph{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int noofpeople=sc.nextInt();
        int stepno=sc.nextInt();

        System.out.println(josephSave(noofpeople,stepno));
    }

    public static int josephSave(int noofpeople,int stepno){
        if(noofpeople==1){
            return 1;
        }else{
            return (josephSave(noofpeople-1, stepno)+stepno-1)%noofpeople+1;
        }
    }
}