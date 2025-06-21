class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int op = 0;
        for (char c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : jewels.toCharArray()){
            if(map.containsKey(c)){
                op += map.get(c);
            }
        }
        return op;
    }
}