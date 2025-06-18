class Solution {
    public int integerBreak(int n) {
        if(n <= 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        int three = n/3;
        int remain = n%3;
        if(remain == 1){
            three--;
            remain = 4;
        }
        else if(remain == 0){
            remain = 1;
        }
        int pro = (int) Math.pow(3,three) * remain;
        return pro;
    }
}