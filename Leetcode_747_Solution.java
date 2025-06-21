class Solution {
    public int dominantIndex(int[] nums) {
        int arr[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        if (arr[nums.length - 1] >= 2 * arr[nums.length - 2]) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == arr[nums.length - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}