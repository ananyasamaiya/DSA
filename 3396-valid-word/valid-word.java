
class Solution {
    public boolean isValid(String word) {
        word = word.toLowerCase();
        boolean isVowel = false;
        boolean isCon = false;
        if(word.length() < 3) return false;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >='0' && ch<='9'){
                continue;
            }
            else if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    isVowel = true;
                }
                else{
                    isCon = true; 
                }
            }
            else{
                return false;
            }
        }
        return isVowel && isCon;
    }
}