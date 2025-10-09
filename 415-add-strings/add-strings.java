class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        StringBuilder str = new StringBuilder();
        int i = n1 - 1;
        int j = n2 - 1;
        int carry = 0;
        while(i>=0 || j>=0){
            int d1 = i>=0 ? num1.charAt(i) - '0' : 0;
            int d2 = j>=0 ? num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 10;
            str.append(sum % 10);
            i--;
            j--;
        }
        if(carry != 0) str.append(carry);
        return str.reverse().toString();
    }
}