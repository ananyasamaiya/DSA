class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;

            int rem = columnNumber % 26;
            str.append(getChar(rem));

            columnNumber /= 26;
        }
        return str.reverse().toString();
    }
    public static char getChar(int number){
        return (char) (number + 'A');
    }
}