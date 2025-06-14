class Solution {
    public boolean canJump(int[] nums) {
        int lastnum = nums.length - 1;

        for(int i = nums.length - 2 ; i>=0 ; i--){
            if(i + nums[i] >= lastnum){
                lastnum = i;
            }
        }
        return lastnum == 0;
    }
}