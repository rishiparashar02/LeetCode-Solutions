class Solution {
    public int dayOfYear(String s) {
        String[] nums = s.split("-");
        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int y = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int d = Integer.parseInt(nums[2]);
        if (isleap(y))
            arr[1] = 29;
        int res = 0;
        for (int i = 0; i < m - 1; i++) {
            res += arr[i];
        }
        res += d;
        return res;
    }

    boolean isleap(int n) {
        return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);
    }
}