class Check_Anagrams{
    public static boolean checkAnagrams(String a, String b){
        a = a.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        b = b.trim().replaceAll("[^a-zA-Z]", "").toLowerCase();
        int[] aCount = new int[26];
        int[] bCount = new int[26];
        if(a.length() != b.length()) return false;

        for(int i=0; i<a.length(); i++){
            int aindex = a.charAt(i) - 'a';
            aCount[aindex]++;
            int bindex = b.charAt(i) - 'a';
            bCount[bindex]++;
        }
        
        for(int k=0; k<aCount.length; k++){
            if(aCount[k] != bCount[k]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String a = "Listen";
        String b = "Silent";
        boolean answer = checkAnagrams(a, b);
        if(answer) System.out.println("Strings are anagrams");
        else System.out.println("Strings are not anagrams");
        
    }
}