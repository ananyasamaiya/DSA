// Kadane's Algorithm - Maximum Subarray Sum

class Kadane_Algorithm{
    public static void max_subarray_sum(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int count_sum = 0;
        for(int i = 0; i<arr.length; i++){
            count_sum+= arr[i];
            max_sum = Integer.max(count_sum, max_sum);
            if(count_sum < 0)
                count_sum = 0;
        } 

        System.out.println("Maximum Subarray Sum : " + max_sum);
    }

    public static void main(String[] args){
        int[] arr = {3, -4, 5, 4, -3, 7, -8};

        max_subarray_sum(arr);
    }
}