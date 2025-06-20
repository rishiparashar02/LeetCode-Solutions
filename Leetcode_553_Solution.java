class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder().append(nums[0]);

        if(n == 1) return sb.toString();
        if(n == 2) return sb.append("/").append(nums[1]).toString();
        sb.append("/(");
        for(int i = 1; i<n-1 ; i++){
            sb.append(nums[i]).append("/");
        }
        sb.append(nums[n-1]);
        sb.append(")");
        return sb.toString();
    }
}