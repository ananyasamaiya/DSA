class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int i = 0;
        int j = 0;
        while(i<length1 && j<length2){
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }
        while(i<length1){
            str.append(word1.charAt(i++));
        }
        while(j<length2){
            str.append(word2.charAt(j++));
        }
        return str.toString();
    }
}