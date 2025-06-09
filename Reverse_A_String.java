class Reverse_A_String{
    public static String reverseAString(String str){
        StringBuilder str1 = new StringBuilder();
        for(int i=str.length()-1; i>=0 ; i--){
            str1.append(str.charAt(i));
        }
        return str1.toString();
    }

    public static void main(String[] args){
        String str = "hello";
        
        String reversedString = reverseAString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedString);
        
    }
} 