class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int strow = 0;
        int stcol = 0;
        int endrow = m-1;
        int endcol = n-1;
        List<Integer> answer = new ArrayList<>();

        while(strow <= endrow && stcol <= endcol){
            for(int i = stcol; i <=endcol ; i++){
                answer.add(matrix[strow][i]);
            }
            for(int i = strow+1 ; i <=endrow ; i++){
                answer.add(matrix[i][endcol]);
            }
            for(int i  = endcol-1 ;i >=stcol ; i--){
                if(strow == endrow){
                    break;
                }
                answer.add(matrix[endrow][i]);
            }
            for(int i = endrow-1 ; i >=strow+1 ; i--){
                if(stcol == endcol){
                    break;
                }
                answer.add(matrix[i][stcol]);
            }
            strow++; endrow--; stcol++; endcol--;
        }
        return answer;
    }
}