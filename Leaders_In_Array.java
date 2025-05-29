class Leaders_In_Array{
    public static void leaders(int[] arr){
        int[] res = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i])
                    break;
            }
            if(j == arr.length){
                res[k] = arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders(arr);
    }
}