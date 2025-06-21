class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length - 1];
        
        while (left <= right) {
            int mid = (left + right) / 2;
            long totalh = 0; 
            
            for (int pile : piles) {
                totalh += (pile + mid - 1) / mid;
            }
            
            if (totalh > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
