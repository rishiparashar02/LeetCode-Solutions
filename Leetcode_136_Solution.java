class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k =0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i<nums.length -1 ; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }
            else{
                k = nums[i];
                break;
            }                 
            k = nums[nums.length-1];      
        }
        return k;
    }
}