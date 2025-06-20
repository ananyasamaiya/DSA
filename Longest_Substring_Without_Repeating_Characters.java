class Longest_Substring_Without_Repeating_Characters{
    public static int lengthOfLongestSubstring(String str){
        int[] lastIndex = new int[256];
        for(int i=0; i<256; i++){
            lastIndex[i] = -1;
        }
        int start = 0;
        int maxLength = 0;
        for(int end=0; end<str.length(); end++){
            char ch = str.charAt(end);
            if(lastIndex[ch] >= start){
                start = lastIndex[ch] + 1;
            }
            lastIndex[ch] = end;
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        String str = "Ananya";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}