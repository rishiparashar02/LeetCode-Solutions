class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> op = new HashSet<>();

        for(int val: nums1){
            s1.add(val);
        }
        for(int val: nums2){
            if(s1.contains(val)){
                op.add(val);
            }
        }
        int oparr[] = new int[op.size()];
        int i = 0;
        for(int val : op){
            oparr[i] = val;
            i++;
        }
        return oparr;
    }
}