class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);
        triangle.add(first_row);

        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prew_row = triangle.get( i -1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);  // 0th cloumn

            for(int j = 1 ; j < i ; j++){
                curr_row.add( prew_row.get(j) + prew_row.get( j-1));
            }

            curr_row.add(1);  // last column
            triangle.add(curr_row);
        }
        return triangle;
    }
}