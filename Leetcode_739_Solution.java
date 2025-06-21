class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        Stack <Integer> stc = new Stack<>();
        
        for(int i= 0; i<n ;i++){
            while( !stc.isEmpty() && temperatures[i] > temperatures[stc.peek()]){
                int index = stc.pop();
                ans[index] = i - index;
            }
            stc.push(i);
        }
        return ans;
    }
}