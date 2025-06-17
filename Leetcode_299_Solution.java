class Solution {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> map = new HashMap<>();

        int count = 0;
        for(int i =0; i<secret.length(); i++){
            char sec = secret.charAt(i);
            char gue = guess.charAt(i);
            if(sec == gue){
                count++;
            }
            else{
                map.put(sec,map.getOrDefault(sec,0) +1);

            }
        }
        int p =0;
        for(int j =0 ; j<secret.length() ; j++){
            char gue = guess.charAt(j);
            if(secret.charAt(j) != gue && map.containsKey(gue) && map.get(gue) > 0) {
                p++;
                map.put(gue, map.get(gue) - 1);
            }
        }
        String res = count+"A"+p+"B";
        return res;
    }
}