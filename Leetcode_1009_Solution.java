class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder res = new StringBuilder("");
        String t = Integer.toBinaryString(n);
        for(char x : t.toCharArray()){
            if(x == '1')
                res.append('0');
            else
                res.append('1');
        }

        return  Integer.parseInt(res.toString(), 2);
    }
}