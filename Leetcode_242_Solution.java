class Solution {
    public boolean isAnagram(String s, String t) {
        char []sh = s.toCharArray();
        char []th = t.toCharArray();

        Arrays.sort(sh);
        Arrays.sort(th);

        return Arrays.equals(sh,th);
    }
}