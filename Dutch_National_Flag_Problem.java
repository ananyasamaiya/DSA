class Dutch_National_Flag_Problem{
    public static void Sort_Element(int[] arr){
        int start = 0, mid = 0, last = arr.length-1;
        int temp; 
        while(mid<=last){
            if(arr[mid] == 0){
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                temp = arr[last];
                arr[last] = arr[mid];
                arr[mid] = temp;
                last--; 
            }
        }
    }
    public static void printArray(int[] arr){
        for(int next : arr){
            System.out.print(next + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2, 0, 1, 2, 1, 0, 1, 0, 1, 2, 2};
        printArray(arr);
        Sort_Element(arr);
        printArray(arr);
    }
}