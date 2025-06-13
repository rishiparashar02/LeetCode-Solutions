class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lefttop = height[left];
        int righttop = height[right];
        int water = 0;

        while(left < right){ 
            if(lefttop < righttop){
                left++;
                lefttop = Math.max(lefttop , height[left]);
                water += lefttop - height[left];
            }
            else{
                right--;
                righttop = Math.max(righttop , height[right]);
                water += righttop - height[right];
            }
        }
        return water;
    }
}