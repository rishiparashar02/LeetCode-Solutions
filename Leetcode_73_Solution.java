class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int [row][col];
        for(int i = 0 ; i< row; i++){
            for(int j = 0 ; j<col ; j++){
                arr[i][j] = matrix[i][j];
            }
        }

        for(int i = 0 ; i< row; i++){
            for(int j = 0 ; j<col ; j++){
                if(arr[i][j] == 0){
                    for(int l = 0 ; l<col ; l++){
                        matrix[i][l] = 0;
                    }
                    for(int l = 0 ;l<row ; l++){
                        matrix[l][j] = 0;
                    }
                }
            }
        } 
    }
}