class Solution {
    public static void setZeroes(int[][] matrix) {
      int n = matrix.length;
        int m = matrix[0].length;
 
        int C0 = 1;
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
 
                    matrix[i][0] = 0;
 
                   
                    if (j == 0)
                        C0 = 0;
                    else
                        matrix[0][j] = 0;
                }
            }
        }
 
        // Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
 
                    // Check for col & row:
                    if (matrix[i][0] == 0
                        || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
 
        // Finally mark the 1st row then 1st col:
        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }
        if (C0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int[][] matrix = { { 0, 1, 2, 0 },
                           { 3, 4, 5, 2 },
                           { 1, 3, 1, 5 } };
 
        // Function call
        setZeroes(matrix);
 
        // Print the resulting matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
