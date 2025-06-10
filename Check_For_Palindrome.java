class Check_For_Palindrome{
    public static boolean checkForPalindrome(String str){
        String trimedString = str.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder str1 = new StringBuilder();
        for(int i=trimedString.length()-1; i>=0 ; i--){
            str1.append(trimedString.charAt(i));
        }
        String reversedString = str1.toString();
        if(trimedString.equals(reversedString)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        boolean answer = checkForPalindrome(str);
        if(answer){
            System.out.println(str + " is a Palindrome");
        }else{
            System.out.println(str + " is not a Palindrome");
        }

    }
}