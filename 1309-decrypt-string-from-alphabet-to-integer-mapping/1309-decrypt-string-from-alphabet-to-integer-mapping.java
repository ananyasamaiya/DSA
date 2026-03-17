class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1 ; i>=0; i--){
            char ch = s.charAt(i);
            // System.out.println(ch);
            if(ch != '#'){
                int number = ch - '0';
                str.append((char)(number + 'a' - 1));
            }else{
                char first = s.charAt(i-2);
                char second = s.charAt(i-1);

                int number = (first - '0')*10 + (second - '0');

                str.append((char)(number + 'a' -1));
                i-=2;  
            }
        }
        return str.reverse().toString();
    }
}