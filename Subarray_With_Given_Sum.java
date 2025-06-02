class Subarray_With_Given_Sum{
    public static void subarrays(int[] arr, int target_sum){
        int size  = arr.length;
        int start = 0;
        int currentSum = 0;
        boolean flag = false;

        for(int end = 0; end<size; end++){
            currentSum+=arr[end];

            while(currentSum > target_sum && start<=end){
                currentSum-=arr[start];
                start++;
            }

            if(currentSum == target_sum){
                System.out.print("Subarray with sum " + target_sum + " is : ");
                flag = true;
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        if(!flag){
            System.out.println("Subarray with sum " + target_sum + " is : none");
        }
    }

    public static void main(String[] args){
        int[] arr = {9, 4, 20, 3, 10, 5};
        int targetSum = 33;

        subarrays(arr, targetSum);
    }
}