class Move_pos_neg_no{
    public static void move_pos_neg(int[] arr){
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int next : arr)
            System.out.print(next + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        printArray(arr);
        move_pos_neg(arr);
        printArray(arr);
    }
}