class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int[] arr_count = new int[3];

        for (int right = 0; right < s.length(); right++) {
            arr_count[s.charAt(right) - 'a']++;

            while (arr_count[0] > 0 && arr_count[1] > 0 && arr_count[2] > 0) {
                count += s.length() - right;
                arr_count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}