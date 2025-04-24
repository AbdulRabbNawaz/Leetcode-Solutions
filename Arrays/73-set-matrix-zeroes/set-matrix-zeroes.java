class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstZeroRow = false;
        boolean firstZeroCol = false;

        for(int i = 0; i < m; i++){
            if(matrix[0][i] == 0){
                firstZeroRow = true;
                break;
            }
        }

        for(int j = 0; j < n; j++){
            if(matrix[j][0] == 0){
                firstZeroCol = true;
                break;
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstZeroRow){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstZeroCol){
            for(int i = 0; i < n; i++){
            matrix[i][0] = 0;
            }
        }
        
    }
}