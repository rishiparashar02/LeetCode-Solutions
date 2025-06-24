class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        for(int i =0 ; i<words.length ; i++){
            for(int j =0 ; j<words.length ; j++){
                if(words[j].contains(words[i]) && (i != j)){
                    answer.add(words[i]);
                    break;
                }
            }
        }
        return answer;
    }
}