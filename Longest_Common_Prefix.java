class Longest_Common_Prefix{
    public static String longestCommonPrefix(String[] arr){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<arr[0].length(); i++){
            char ch = arr[0].charAt(i);
            int j;
            for(j=1; j<arr.length; j++){
                if(i >= arr[j].length() || arr[j].charAt(i) != ch){
                    return result.toString();
                }
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args){
        String[] arr = {"apple", "app", "append"};
        System.out.println(longestCommonPrefix(arr));
    }
}