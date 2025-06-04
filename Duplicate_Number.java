class Duplicate_Number{
    public static void duplicateNumber(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int k = 0; k< i; k++){
                if(arr[i] == arr[k]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                System.out.print("Duplicates element : ");
                    count++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println("No duplicates found");
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 2, 1, 1};
        duplicateNumber(arr);
    }
}