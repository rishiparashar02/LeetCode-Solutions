import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        int[] ans = new int[arr1.length];
        for (int num : arr2) {
            int count = map.getOrDefault(num, 0);
            for (int i = 0; i < count; i++) {
                ans[index++] = num;
            }
            map.remove(num);
        }

        List<Integer> remain = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remain.add(num);
            }
        }

        Collections.sort(remain);
        for (int num : remain) {
            ans[index++] = num;
        }
        return ans;
    }
}
