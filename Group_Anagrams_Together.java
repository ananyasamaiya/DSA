import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Group_Anagrams_Together{
    public static void groupAnagramsTogether(String[] arr){
        boolean[] visited = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(arr[i]);
            visited[i] = true;

            for(int j=i+1; j<arr.length; j++){
                if(!visited[j] && isAnagram(arr[i], arr[j])){
                    group.add(arr[j]);
                    visited[j] = true;
                }
            }
            System.out.println(group);
        }
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }
    public static void main(String[] args){
        String[] arr = {"Tea", "Eat", "ate", "tae", "TEA"};
        groupAnagramsTogether(arr);
    }
}