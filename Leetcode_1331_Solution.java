class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int N = arr.length;
        HashMap<Integer, Integer> rank = new HashMap<>();
        int narr[] = Arrays.stream(arr).distinct().sorted().toArray();

        for (int i = 0; i < narr.length; i++) {
            rank.put(narr[i], i + 1);
        }

        for (int i = 0; i < N; i++) {
            arr[i] = rank.get(arr[i]);
        }

        return arr;
    }
}