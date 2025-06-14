class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charstr = s.toCharArray();
            Arrays.sort(charstr);
            String sortedWord = new String(charstr);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
