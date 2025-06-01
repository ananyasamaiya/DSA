class Find_All_Pair{
    public static void find_all_pairs(int[] arr, int target_sum){
        boolean flag = false;
        System.out.println("Pairs whose sum is " + target_sum + " are : ");
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if((arr[i] + arr[j]) == target_sum){
                flag = true;
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
            }
        }
        if(!flag){
            System.out.println("none");
        }
    }
    public static void main(String[] args){
        int[] arr= {5, 7, -1, 3, 2, 1};
        int target_sum = 6;

        find_all_pairs(arr, target_sum);
    }
}