class Solution {
    String[] morsecode = {
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
        ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> codes = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            int n = word.length();
            for (int i = 0; i < n; i++) {
                sb.append(morsecode[word.charAt(i) - 'a']);
            }
            codes.add(sb.toString());
        }

        return codes.size();
    }
}