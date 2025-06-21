class Solution {
    public int numFriendRequests(int[] ages) {
        int fr = 0;
        Arrays.sort(ages);
        for (int x = 0;x < ages.length; x++) {
            int minage = ages[x] / 2 + 7;
            if (minage < ages[x]) {
                int left = binarySearch(ages, 0, ages.length, minage);
                int right = binarySearch(ages, 0, ages.length, ages[x]) - 1;
                fr += right - left;
            }
        }
        return fr;
    }

    private int binarySearch(int[] ages, int l, int r, int target) {
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (ages[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}