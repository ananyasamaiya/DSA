class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                list.push(ch);
            }else{
                if(list.size() == 0) return false;

                char top = list.pop();
                if(ch == ')' && top !='(') return false;
                else if(ch == '}' && top != '{') return false;
                else if(ch == ']' && top != '[') return false;

            }
            
        }
        return list.size() == 0 ? true : false;
    }
}