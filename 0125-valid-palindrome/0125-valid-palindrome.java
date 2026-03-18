class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s).reverse();

        String s2 = sb.toString();

        return s.equals(s2);
    }
}