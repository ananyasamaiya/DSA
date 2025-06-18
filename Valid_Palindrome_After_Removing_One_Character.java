class Valid_Palindrome_After_Removing_One_Character{
    public static boolean isPalindrome(String str, int start, int end){
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean validPalindromeAfterRemoving1Char(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return isPalindrome(str, start, end-1) || isPalindrome(str, start+1, end);
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "abca";
        String str2 = "rfdcd";
        System.out.println(validPalindromeAfterRemoving1Char(str1));
        System.out.println(validPalindromeAfterRemoving1Char(str2));
    }
}