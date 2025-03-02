// Intuition
// Find the places where we have 0 in matrics, then for each place set the row as 0 and column as 0s;

// Approach
// I am taking a pairs set to store the no of places we have 0 in the matrix.
// After that i am iterating over the set and filling 0s in the rows and column.

// Complexity
// Time complexity:
// O((m * n) + (k * n))
// here m = rows, n = column and k = no of 0 in matrix

// Space complexity:
// O(k)
// k = no of 0 in matrix

// Code
class Pair {
    public int first;
    public int second;

    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Pair> pairs = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    pairs.add(new Pair(i, j));
                }
            }
        }

        for (Pair p : pairs) {
            int j = p.second;
            int i = p.first;
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][j] = 0;
            }
            matrix[i] = new int[matrix[0].length];
        }
    }
}
