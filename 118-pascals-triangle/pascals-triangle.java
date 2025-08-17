class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int row=1; row<numRows; row++){
            List<Integer> l = new ArrayList<>();
            List<Integer> pl = list.get(row-1);
            
            l.add(1);
            for(int col=1; col<row; col++){
                int digit = pl.get(col-1) + pl.get(col);
                l.add(digit);
            }

            l.add(1);

            list.add(l);
        }
        return list;
    }
}