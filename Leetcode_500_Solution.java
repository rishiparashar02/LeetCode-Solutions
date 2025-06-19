import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('Z', 'X', 'C', 'V', 'B', 'N', 'M'));
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String upperWord = word.toUpperCase();
            Set<Character> row = null;
            if (row1.contains(upperWord.charAt(0))) {
                row = row1;
            } else if (row2.contains(upperWord.charAt(0))) {
                row = row2;
            } else {
                row = row3;
            }
            
            boolean canType = true;
            for (char c : upperWord.toCharArray()) {
                if (!row.contains(c)) {
                    canType = false;
                    break;
                }
            }
            
            if (canType) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
