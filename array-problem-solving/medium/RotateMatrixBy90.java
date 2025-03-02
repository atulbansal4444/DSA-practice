class Solution {
    public void rotate(int[][] matrix) {
        int edgeLength = matrix.length;

        int i = 0;
        int j = edgeLength - 1;

        while(i < j) {
            int [] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }

        for (int row = 0; row < edgeLength; row++) {
            for (int col = row + 1; col < edgeLength; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
