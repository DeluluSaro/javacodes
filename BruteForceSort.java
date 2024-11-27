class BruteForceSort {

    public static void bruteforce(int[] arr) {

        
       for(int i=0;i<=arr.length-1;i++){
        for(int j=i+1;j<=arr.length;j++){
            if(arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        // Initialize the unsorted array
        int[] arr = {1, 23, 4, 5, 6};

        // Sort the array using brute-force method
        bruteforce(arr);
    }
}
