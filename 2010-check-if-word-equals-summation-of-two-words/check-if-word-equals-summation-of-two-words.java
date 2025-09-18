class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = conventIntoInt(firstWord);
        int second = conventIntoInt(secondWord);
        int target = conventIntoInt(targetWord);

        if(first + second == target) return true;
        return false;
    }
    public static int conventIntoInt(String str){
        StringBuilder s = new StringBuilder();
        for(char c : str.toCharArray()){
            int temp = c - 'a';
            s.append(temp);
        }
        return Integer.parseInt(s.toString());
    }
}