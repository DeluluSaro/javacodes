public class LongestPalindrome {

    public static boolean isPalindrom(String abc){
        int left=0;
        int right=abc.length()-1;


        while(left<right){

            if(abc.charAt(left)!=abc.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindrome(String abc){


  int n=abc.length();

        String longestPal="";

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String subs=abc.substring(i, j);
                if(isPalindrom(subs)&&subs.length()>longestPal.length()){
                    longestPal=subs;
                }
            }
        }



        return longestPal;

    }

    public static void main(String[] args) {
        String abc="babad";

        System.out.print(longestPalindrome(abc));
    }
    
}
