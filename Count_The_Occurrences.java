class Count_The_Occurrences{
    public static void count_occurrences(int[] arr, int element){
        int count = 0;
        for(int i : arr){
            if(element == i)
                count++;
        }

        System.out.println("Element " + element + " occurs " + count + " times");
    }

    public static void main(String[] args){
        int[] arr =  {7, 7, 7, 7, 6, 5, 7};

        int element  = 7;

        count_occurrences(arr, element);   
    }
}