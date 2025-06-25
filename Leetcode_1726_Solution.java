class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i != j) {
                    map.put(nums[i] * nums[j],map.getOrDefault(nums[i] * nums[j],0) + 1);
                }
            }
        }
        int count = 0;
        for (int frequency:map.values()) {
            if (frequency > 1) {
                count += frequency * (frequency-1)/2;
            }
        }
        return count *8;
    }
}