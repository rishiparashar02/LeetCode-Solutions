class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = nextnum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    int nextnum(int n){
        int op = 0;
        while(n>0){
            int digit = n % 10;
            op += digit * digit;
            n = n / 10;
        }
        return op;
    }
}