class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> str = new HashMap<>();
        str.put('I' , 1);
        str.put('V' , 5);
        str.put('X' , 10);
        str.put('L' , 50);
        str.put('C' , 100);
        str.put('D' , 500);
        str.put('M' , 1000);

        int count = 0;
        for(int i =0 ; i<s.length(); i++){
            int value = str.get(s.charAt(i)); 
            if (i + 1 < s.length() && value < str.get(s.charAt(i + 1))) {
                count -= value;
            } else {
                count += value;
            }
        }
        return count;
    }
}