class Solution {
    public void setZeroes(int[][] matrix) {

        // Time Complexity - O(n * m)
        // Space Complexity - O(n + m) 

        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(zeroRows[i]){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < m; j++){
            if(zeroCols[j]){
                for(int i = 0; i < n; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}