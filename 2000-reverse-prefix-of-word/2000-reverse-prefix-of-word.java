class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        int index = word.indexOf(ch);

        str.append(word.substring(0,index+1)).reverse();

        str.append(word.substring(index+1));

        return str.toString();
    }
}