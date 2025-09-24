class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder str = new StringBuilder();

        if(numerator < 0 ^ denominator < 0) str.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        str.append(num/den);
        long remainder = num % den;

        if(remainder == 0) return str.toString();

        str.append(".");
        HashMap<Long,Integer> map = new HashMap<>();
        while(remainder!=0){
            if(map.containsKey(remainder)){
                int index = map.get(remainder);
                str.insert(index,"(");
                str.append(")");
                break;
            }
            map.put(remainder,str.length());
            remainder *=10;
            str.append(remainder / den);
            remainder %= den;
        }
        return str.toString();
    }
}