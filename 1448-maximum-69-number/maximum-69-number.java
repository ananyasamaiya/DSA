class Solution {
    public int maximum69Number (int num) {
        String n = Integer.toString(num);
        StringBuilder str = new StringBuilder();
        boolean flag = true;
        for(int i=0; i<n.length(); i++){
            str.append(n.charAt(i));
            if(flag && n.charAt(i) == '6'){
                str.deleteCharAt(i);
                str.append('9');
                flag = false;
            }
        }
        int result = Integer.parseInt(str.toString());
        return result;
    }
}