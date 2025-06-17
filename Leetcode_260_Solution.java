class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        int a =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans[a] = entry.getKey();
                a++;
            }
        }
        return ans;


    }
}