import java.util.Set;
import java.util.TreeSet;
class UniquePermuntation{

    public static void uniquePermun(String a){
        char[] arr=a.toCharArray();

        Set<String> uniquepermun=new TreeSet<>();

        backtrack(arr,0,uniquepermun);

        for(String prem:uniquepermun){
            System.out.println(prem);
        }
    } 

    static void backtrack(char[] arr,int start,Set<String> uniquepermun){


        if(start==arr.length){
            uniquepermun.add(new String(arr));
            return;
        }

        for(int i=start;i<arr.length;i++){
            swap(arr,start,i);


            backtrack(arr, start+1, uniquepermun);

            swap(arr,start,i);
        }

    }

    public static void swap(char[] arr,int i, int j){

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    public static void main(String[] args) {
        String a="abc";


        uniquePermun(a);
    }
}