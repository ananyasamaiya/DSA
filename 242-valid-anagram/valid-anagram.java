class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] aCount = new int[26];
        int[] bCount = new int[26];

        for(int i=0; i<s.length(); i++){
            int aIndex = s.charAt(i) - 'a';
            aCount[aIndex]++;
            int bIndex = t.charAt(i) - 'a';
            bCount[bIndex]++;

        }

        for(int i=0; i<aCount.length; i++){
            if(aCount[i] != bCount[i]){
                return false;
            }
        }
        return true;
        

    }
}