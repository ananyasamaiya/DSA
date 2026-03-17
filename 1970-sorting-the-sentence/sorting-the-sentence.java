class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            int length = arr[i].length();
            int pos = arr[i].charAt(length-1) - '0';

            String actual = arr[i].substring(0, length-1);
            result[pos-1] = actual;
        }
        return String.join(" ",result);
    }
}