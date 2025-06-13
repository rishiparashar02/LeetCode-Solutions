class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        parentheses(0, 0, "", n, list);
        return list;
    }    
    private void parentheses(int openp, int closep, String s, int n, List<String> list){
        if(openp == closep && openp + closep == 2*n){
            list.add(s);
            return;
        }
        if(openp < n){
            parentheses(openp+1, closep, s+"(" , n , list);
        }
        if(closep < openp){
            parentheses(openp, closep+1, s+")" , n , list);
        }
    }
}