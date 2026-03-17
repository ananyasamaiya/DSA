class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length()/2;
        String a = s.substring(0,half);
        String b = s.substring(half);
        int aCount = 0;
        int bCount = 0;
        for(int i=0; i<a.length(); i++){
            if(isVowel(a.charAt(i))){
                aCount++;
            }
            if(isVowel(b.charAt(i))){
                bCount++;
            }
        }
        return aCount == bCount;
    }
    public static boolean isVowel(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            return true;
        }
        return false;
    }
}