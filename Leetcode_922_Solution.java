class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[] = new int[nums.length];
        int a =0, b=0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] %2 == 0){
                arr[a] = nums[i];
                a+=2;
            }
            else{
                arr[b+1] = nums[i];
                b+=2;
            }
        }
        return arr;
    }
}