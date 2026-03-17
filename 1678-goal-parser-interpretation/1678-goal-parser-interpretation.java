class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int prev = 0;
        for(int i=0; i<command.length(); i++){
           if(command.charAt(i) == 'G') {
                str.append('G');
           }else if(command.charAt(prev) == '(' && command.charAt(i) == ')'){
                str.append('o');
           }else if(command.charAt(prev)== '(' && command.charAt(i) == 'a'){
                str.append("al");
                i+=2;
           }
           prev = i;
        }

        return str.toString();
    }
}