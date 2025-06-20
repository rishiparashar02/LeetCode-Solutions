class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> s = new HashSet<>(dict);
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>(
            Arrays.asList(sentence.split(" "))
        );
        
        for (String t : list) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i++);
                if (s.contains(curr)) {
                    sb.append(curr).append(" ");
                    break;
                }

                if (i == t.length() + 1) sb.append(t).append(" ");
            }
        }
        
        sb.deleteCharAt(sb.length() - 1); 
        return sb.toString();
    }
}