class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i =0 ; i<expected.length ;i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}