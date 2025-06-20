class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for(int i =1; i<nums.length ; i++){
            if(nums[i] < nums[i-1]){
                if(cnt++>0||(i>1 && i<nums.length-1 && nums[i-2]>nums[i] && nums[i+1]<nums[i-1])){
            return false;
                }
            }
        }
        return true;
    }
}