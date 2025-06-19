import java.math.*;
class Solution {
    public String convertToBase7(int num) {
       BigInteger m = new BigInteger("" + num);
        return m.toString(7);
    }
}