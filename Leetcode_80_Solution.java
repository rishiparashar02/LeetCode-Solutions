class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) <= 2) {
                nums[p++] = i;
            }
        }
        return p;

    }
}