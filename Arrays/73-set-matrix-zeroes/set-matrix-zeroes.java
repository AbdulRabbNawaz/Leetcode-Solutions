class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Store the rows and columns to be zeroed
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        // Step 1: Record zero rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for (int i = 0; i < n; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for (int j = 0; j < m; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
