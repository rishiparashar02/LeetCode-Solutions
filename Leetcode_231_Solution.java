class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n%2 !=0) return false;
        for(int i=0;  i<33; i++){
            int sum = (int)Math.pow(2,i);
            if(sum == n) return true;
        }
        return false;
    }
}