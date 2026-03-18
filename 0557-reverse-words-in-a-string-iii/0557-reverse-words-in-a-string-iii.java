class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(String next : arr){
            for(int j=next.length()-1; j>=0; j--){
                str.append(next.charAt(j));
            }
            str.append(" ");
        }
        return str.deleteCharAt(str.length()-1).toString();
    }
}