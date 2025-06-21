class Solution {
    public List<Integer> partitionLabels(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        List<Integer> list = new ArrayList<>();
        int max = 0;
        int prior = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if (max == i) {
                list.add(max - prior);
                prior = max;
            }
        }
        return list;
    }
}