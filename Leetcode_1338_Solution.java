class Solution {
    public int minSetSize(int[] arr) {
        int size = arr.length, requiredSize = size / 2;
        int currentSize = 0, minimumSet = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        } 

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        while (currentSize < requiredSize) {
            currentSize += list.remove(0);
            minimumSet++;
        }

        return minimumSet;
    }
}