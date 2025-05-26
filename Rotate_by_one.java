class Rotate_by_one{
    public static void rotate(int[] arr){
        int last = arr[arr.length - 1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before : ");
        printArray(arr);
        rotate(arr);
        System.out.println("After : ");
        printArray(arr);
        
    }

}