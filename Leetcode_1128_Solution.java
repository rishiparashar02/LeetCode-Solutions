class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int res = 0;
        for (int[] d : dominoes) {
            int val;
            if (d[0] < d[1]) {
                val = d[0] * 10 + d[1];
            } else {
                val = d[1] * 10 + d[0];
            }
            res += count[val];
            count[val]++;
        }
        return res;
    }
}
