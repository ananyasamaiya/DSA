class Convert_String_To_Integer{
    public static int convertStringToInteger(String str){
        String a = str.trim();
        if (a.isEmpty()) return 0;
        int sign = 1,result = 0, i = 0;
        if(a.length() > 0 && (a.charAt(0) == '+' || a.charAt(0) == '-')){
            sign = (a.charAt(0) == '-') ? -1 : 1;
            i++;
        }
        while(i<a.length() && Character.isDigit(a.charAt(i))){
                int digit = a.charAt(i) - '0';
                if(result > ((Integer.MAX_VALUE - digit)/10)){
                    return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + digit;
                i++;
        }
        return result * sign;
    }
    public static void main(String[] args){
        String str1 = "   ";
        String str2 = "-91283472382";
        String str3 = "-9128";
        String str4 = "4193 with words";
        String str5 = "words and 987";
        System.out.println(convertStringToInteger(str1));
        System.out.println(convertStringToInteger(str2));
        System.out.println(convertStringToInteger(str3));
        System.out.println(convertStringToInteger(str4));
        System.out.println(convertStringToInteger(str5));
    }
}