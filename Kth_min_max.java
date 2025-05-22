import java.util.Scanner;

class Kth_min_max{
    public static void k_min_max(int[] arr, int k){
        for(int i = 0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
            if(arr[j] < arr[index]){
                index = j;
                }
            }
            if(index != i){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        
System.out.println("The " + k + "rd smallest element is: " + arr[k-1]);
System.out.println("The " + k + "rd largest element is: " + arr[arr.length - k]);
    }

    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {7, 10, 4, 3, 20, 15, 25, 30};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of K : ");
        int k = in.nextInt();
        printArray(arr);
        k_min_max(arr,k);
    }
}