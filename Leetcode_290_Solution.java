class Solution {
    public boolean wordPattern(String pattern, String s) {
        String wordsins[] = s.split(" ");

        if (wordsins.length != pattern.length())
            return false;
        Map<Character,String> m = new HashMap<>();
        Set<String> done = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String st = wordsins[i];

            if (m.containsKey(c)) {
                if (!m.get(c).equals(st)) {
                    return false;
                }
            } else {
                if (done.contains(st)) {
                    return false;
                }
                m.put(c, st);
                done.add(st);
            }
        }
        return true;
    }
}