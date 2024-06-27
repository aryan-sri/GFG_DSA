//{ Driver Code Starts
import java.util.*;

class Check_IsToepliz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) arr[i][j] = sc.nextInt();
            }

            Solution g = new Solution();
            boolean b = g.isToeplitz(arr);

            if (b == true)
                System.out.println("true");
            else
                System.out.println("false");

            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean isToeplitz(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int col = 0; col < cols; col++) {
            if (!checkDiagonal(mat, 0, col)) {
                return false;
            }
        }

       
        for (int row = 1; row < rows; row++) {
            if (!checkDiagonal(mat, row, 0)) {
                return false;
            }
        }

        return true;
    }

    boolean checkDiagonal(int[][] mat, int startRow, int startCol) {
        int value = mat[startRow][startCol];
        int rows = mat.length;
        int cols = mat[0].length;

        int row = startRow;
        int col = startCol;

        while (row < rows && col < cols) {
            if (mat[row][col] != value) {
                return false;
            }
            row++;
            col++;
        }

        return true;
    }

        
}