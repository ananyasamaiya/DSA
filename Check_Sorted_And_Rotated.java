class Check_Sorted_And_Rotated{
    public static void check_sorted_and_rotated(int[] arr){
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }
        if(arr[0] < arr[arr.length-1])
            count++;
        if(count == 1){
            System.out.println("Array is Sorted and Rotated");
        }else{
            System.out.println("Array is not Sorted and Rotated");
        }

    }
    public static void main(String[] args){
        int[] arr = {8, 9, 1, 4, 5};

        check_sorted_and_rotated(arr);
    }
}