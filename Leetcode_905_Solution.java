class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a = 0;
        int ans[] = new int[nums.length];

        for(int i: nums){
            if(i %2 == 0){
                ans[a++] = i;
            }
        }

        for(int i: nums){
            if(i %2 != 0){
                ans[a++] = i;
            }
        }
        return ans;
    }
}