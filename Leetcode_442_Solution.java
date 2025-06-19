class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) +1);
        }
        //or else me list me add karsakte
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}