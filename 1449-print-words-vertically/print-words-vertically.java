class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();

        String[] arr = s.split(" ");
        int max = 0;
        
        for(String next : arr){
            max = Math.max(max,next.length());
        }
        System.out.println(max);

        for(int k=0; k<max; k++){
            StringBuilder str = new StringBuilder();
            for(int i=0; i<arr.length; i++){
                if(k < arr[i].length()){
                    str.append(arr[i].charAt(k));
                }else{
                    str.append(" ");
                }
            }
            int end = str.length() - 1;
            while(end >=0 && str.charAt(end) == ' '){
                end--;
            }
            list.add(str.substring(0,end+1));
        }
        

        return list;

    }
}