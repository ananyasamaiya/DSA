class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String w1 : word1){
            str1.append(w1);
        }
        for(String w2 : word2){
            str2.append(w2);
        }

        boolean result = str1.toString().equals(str2.toString());

        return result;
    }
}