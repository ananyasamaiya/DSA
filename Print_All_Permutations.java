class Print_All_Permutations{
    public static void printAllPermutations(char[] input, int index){
        if(index == input.length){
            System.out.println(input);
            return;
        }
        for(int i = index; i<input.length; i++){
            swap(input, i, index);

            printAllPermutations(input, index+1);

            swap(input, i, index);
        }
    }

    public static void swap(char[] input, int x, int y){
        char temp = input[x];
        input[x] = input[y];
        input[y] = temp;
    }
    public static void main(String[] args){
        String str = "ABC";
        printAllPermutations(str.toCharArray(), 0);
    }
}