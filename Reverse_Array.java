class Reverse_Array{
    public static void reverse(int[] arr){
        int temp;
        for(int i=0,j=arr.length-1; i<arr.length/2; i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
        }
    }
    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {34, 98, 56, 74, 11};
        System.out.println("Array: ");
        printArray(arr);
        
        reverse(arr);
        System.out.println("\nReverse Array: ");
        printArray(arr);
    }
}