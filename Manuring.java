public class Manuring {

    public static int nofPaths(int a,int b){
        if(a==1||b==1){
            return 1;
        }


        return nofPaths(a-1, b)+nofPaths(a, b-1);
    }

    public static void main(String[] args) {
        

        System.out.println(nofPaths(3,3));
    }
    
}
