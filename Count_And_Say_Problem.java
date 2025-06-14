class Count_And_Say_Problem{
    public static String countAndSayProblem(int n){
        if(n ==1){
            return "1";
        }
        String result = "1";
        for(int i=2; i<=n; i++){
            StringBuilder current = new StringBuilder();
            int count = 1;
            char ch = result.charAt(0);

            for(int j=1; j<result.length(); j++){
                if(result.charAt(j) == ch){
                    count++;
                }
                else{
                    current.append(count).append(ch);
                    ch = result.charAt(j); 
                    count = 1;
                }
            }
            current.append(count).append(ch);

            result = current.toString();
        }
        return result;
    }
    public static void main(String[] args){
        int number = 7;
        System.out.println(countAndSayProblem(number));
    }
}