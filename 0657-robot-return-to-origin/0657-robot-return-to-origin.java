class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null) return true;
        int uCount = 0;
        int lCount = 0;

        for(char ch : moves.toCharArray()){
            switch(ch){
                case 'U': uCount++;
                            break;
                case 'D': uCount--;
                            break;
                case 'L': lCount++;
                            break;
                case 'R': lCount--;

            }
            
        }
        return (lCount == 0 && uCount == 0) ? true : false;
    }
}