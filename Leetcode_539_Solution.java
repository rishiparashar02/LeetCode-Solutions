class Solution {
    public int findMinDifference(List<String> tp) {
        int mini = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();

        for (String val : tp) {
            int hr = 10 * (val.charAt(0) - '0') + (val.charAt(1) - '0');
            int min = 10 * (val.charAt(3) - '0') + (val.charAt(4) - '0');
            list.add(hr * 60 + min);
        }

        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            mini = Math.min(mini, list.get(i) - list.get(i - 1));
        }

        int n = list.size();
        mini = Math.min(mini, 1440 - (list.get(n - 1) - list.get(0)));
        return mini;
    }
}