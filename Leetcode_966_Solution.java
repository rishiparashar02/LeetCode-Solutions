class Solution {
    public String[] spellchecker(String[] W, String[] Q) {
        Set<String> exact = new HashSet<>(Arrays.asList(W));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelMasked = new HashMap<>();

        for (int i = W.length - 1; i >= 0; i--) { // Reverse to prioritize first occurrence
            String word = W[i];
            String lower = word.toLowerCase();
            String masked = lower.replaceAll("[aeiou]", "*");
            caseInsensitive.put(lower, word);
            vowelMasked.put(masked, word);
        }

        for (int i = 0; i < Q.length; i++) {
            String query = Q[i];
            if (exact.contains(query)) continue;
            String lower = query.toLowerCase();
            String masked = lower.replaceAll("[aeiou]", "*");
            Q[i] = caseInsensitive.getOrDefault(lower, vowelMasked.getOrDefault(masked, ""));
        }

        return Q;
    }
}
