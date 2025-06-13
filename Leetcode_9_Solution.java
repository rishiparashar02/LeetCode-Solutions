class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
             return false;
        }

        int reverse = 0;
        int num = x;

        while( num != 0){
            int no = (int) (num % 10);
            reverse = reverse *10 + no;
            num /= 10;
        }
        return (reverse == x);
    }   
}