class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(j>=0 && i<matrix.length){
            if(matrix[i][j]==target)return true;
            if(j-1>=0 && matrix[i][j-1]<target){
                i++;
            }
            else{
                if(j-1<0)i++;
                else j--;
            }
        }
        return false;
    }
}