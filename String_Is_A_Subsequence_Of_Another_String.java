class String_Is_A_Subsequence_Of_Another_String{
        public static boolean subsequenceOfAnotherString(String s1, String s2){
        int i = 0,j = 0;
        while(i < s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s1.length()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s1 = "axc";
        String s2 = "ahbgdc";
        boolean result = subsequenceOfAnotherString(s1, s2);
        System.out.println(result);
    }
}