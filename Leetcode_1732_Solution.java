class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int diff = 0;
        for(int i=0 ; i<gain.length ; i++){
            diff += gain[i];
            max = Math.max(max, diff);
        }
        if(max < 0) return 0;
        return max;
    }
}