class Maximum_Product_Subarray{
    public static void maximum_product_subarray(int[] arr){
        int max_product = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int start=0,end= arr.length-1; start<arr.length; start++, end--){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix = prefix * arr[start];
            suffix = suffix * arr[end];

            max_product = Integer.max(max_product, Integer.max(prefix, suffix));
        }
        System.out.println("Maximum product subarray : " + max_product);
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, 2, -1, 4};
        maximum_product_subarray(arr);
    }
}