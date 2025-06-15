class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum;
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(target == sum){
                return new int[] {left+1 , right+1};
            }
            else if(target < sum){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {};
    }
}