class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int m = 0;
        int prefix = 0;
        int[] arr = new int[k];
        arr[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i] % k + k) % k;
            m += arr[prefix];
            arr[prefix]++;
        }
        return m;
    }
}