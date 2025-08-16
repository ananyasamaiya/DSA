class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder();
        str.append('a');
        while(true){
            StringBuilder ch = new StringBuilder();
            for(int i=0; i<str.length();i++){
                char c = (char)(str.charAt(i) + 1);
                ch.append(c);
            }
            str.append(ch);
            if(str.length() > k){
                System.out.println(str);
                return str.charAt(k-1);
            }
        }
    }
}