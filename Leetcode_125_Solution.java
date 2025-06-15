class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char arr [] = new char[n];
        String str = s.toLowerCase(); 
        arr = str.toCharArray();

        for(int i=0; i<n; i++){
            if(Character.isAlphabetic(arr[i]) || Character.isDigit(arr[i])){
              sb.append(arr[i]); 
            }
        }
        int i = 0;
        int j = sb.length()-1;
        while(i <= j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}