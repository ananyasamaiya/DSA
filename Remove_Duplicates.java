class Remove_Duplicates{
    public static String removeDuplicates(String str){
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(answer.indexOf(String.valueOf(c)) == -1){
                answer.append(c);
            }
        }
        return answer.toString();
    }
    public static void main(String[] args){
        String str = "programming";
        System.out.println("Original String : " + str);
        str = removeDuplicates(str);
        System.out.println("After Removing Duplicates : " + str);
    }
}