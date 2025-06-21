class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum = 0, tsum = 0, chunk = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            tsum += i;
            if (sum == tsum) {
                chunk++;
            }
        }
        return chunk;
    }
}