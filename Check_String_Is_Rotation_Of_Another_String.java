class Check_String_Is_Rotation_Of_Another_String{
    public static boolean check_string_is_rotation_of_another_String(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        String concatenation = str1 + str1;

        return concatenation.contains(str2);
    }
    public static void main(String[] args){
        String str1 = "abcd";
        String str2 = "cdab";

        boolean result = check_string_is_rotation_of_another_String(str1, str2);

        System.out.println(result);
    }
}