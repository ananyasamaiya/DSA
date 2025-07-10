import java.util.Arrays;
class Solution {
    public char findTheDifference(String s, String t) {
        int[] sarr = new int[s.length()];
        int[] tarr = new int[t.length()];
        int m=0, n=0;
        for(int i=0; i<s.length(); i++){
            sarr[m++] = s.charAt(i);
            tarr[n++] = t.charAt(i);
        }
        tarr[n]= t.charAt(t.length()-1);
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i=0; i<sarr.length; i++){
            if(sarr[i] != tarr[i]){
                return (char)tarr[i];
            }
        }
        return (char)tarr[t.length()-1];
    }
}