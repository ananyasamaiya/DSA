class Compress_The_String{
    public static String compressTheString(String str){
        int count = 1;
        StringBuilder result = new StringBuilder();
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);

                if(str.charAt(i-1) == ch){
                    count++;
                }
                else{
                    result.append(str.charAt(i-1)).append(count);
                    count = 1;  
                }
        }
        result.append(str.charAt(str.length() -1)).append(count);
        return result.toString();
    }
    public static void main(String[] args){
        String str = "aabbbcccdd";
        System.out.println(compressTheString(str));
    }
}