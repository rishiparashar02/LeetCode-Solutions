class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        List <String> arr = new ArrayList<>(Arrays.asList(words));
        
        Collections.reverse(arr);
        return String.join(" ", arr);
    }
}