class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;
        int current = 0;
        while(left < right){
            current = (right - left) * Math.min(height[left] , height[right]);
            maxarea = Math.max(maxarea, current);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxarea;
    }
}
