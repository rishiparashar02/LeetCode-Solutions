import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA != freqB) {
                return freqA - freqB;
            } else {
                return b - a;
            }
        });

        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}
