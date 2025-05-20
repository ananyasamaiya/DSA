// Find the maximum and minimum element in an array
class Maximum_Minimum_Element{
    static void maxmin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int j : arr){
            System.out.println(j);
        }
        System.out.println("Maximum element : " + max);
        System.out.println("Minimum element : " + min);
    }
    public static void main(String[] args){
        int[] arr = {12,-56,-34,9,76,26};
        maxmin(arr);
    }
}
