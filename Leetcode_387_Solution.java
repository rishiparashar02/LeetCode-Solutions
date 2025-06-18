class Solution {
    public int firstUniqChar(String s) {
        int [] cnt = new int[26];
        for(char ch : s.toCharArray()){
            cnt[ch-'a']++;
        }

        int i=0;
        for(char ch : s.toCharArray()){
            if(cnt[ch-'a'] == 1) return i;
            i++;
        }
        return -1;
    }
}