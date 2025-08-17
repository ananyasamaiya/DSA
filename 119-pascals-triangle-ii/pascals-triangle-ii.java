class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int row=1; row<=rowIndex; row++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prevlist = triangle.get(row -1);

            list.add(1);
            for(int col=1; col<row; col++){
                int digit = prevlist.get(col-1) + prevlist.get(col);
                list.add(digit);
            }
            list.add(1);

            triangle.add(list);

        }
        
        return triangle.get(rowIndex);
    }
}