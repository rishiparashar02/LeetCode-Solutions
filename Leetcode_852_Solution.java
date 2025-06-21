class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            max = Math.max(arr[i], max);
        }
        return list.indexOf(max);
    }
}