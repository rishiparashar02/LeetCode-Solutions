class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int conn = 0;
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i =0; i<m ; i++){
            for(int j =0; j<n ;j++){
                row[i] += grid[i][j];
                col[j] += grid[i][j];
            }
        }
        for(int i =0; i<m ; i++){
            for(int j =0; j<n ;j++){
                if(grid[i][j] == 1 && (row[i] > 1 || col[j] > 1)){
                    conn++;
                }
            }
        }
        return conn;
    }
}