class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || word.equals(word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase()) || word.equals(word.toLowerCase());
    }
}