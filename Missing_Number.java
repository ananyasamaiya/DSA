class Missing_Number{
    public static void missing_Number(int[] arr){
        int size = arr.length;
        int n = size + 1;

        int expected_sum = (n*(n+1))/2;
        int actual_sum = 0;
        for(int i :arr){
            actual_sum+=i;
        }

        int missing_no = expected_sum - actual_sum;
        System.out.println("Missing number : " + missing_no);
    }
    public static void main(String[] args){
        int[] arr = {8, 1, 3, 6, 2, 7, 4};

        missing_Number(arr);
    }
}