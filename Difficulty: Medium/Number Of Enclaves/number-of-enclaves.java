//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] rowD = {1, -1, 0, 0};
    static int[] colD = {0, 0, -1, 1};
    int numberOfEnclaves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        // Your code here
        boolean vis[][] = new boolean[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(i ==0 || j == 0 || i == n -1 || j == m-1 && grid[i][j] ==1)
                {
                    dfs(grid, vis, i, j);
                }
            }
        }
        
        int en = 0;
        for(int i = 1;i<n-1;i++)
        {
            for(int j = 1;j<m-1;j++)
            {
                //System.out.println(vis[i][j]);
                if(grid[i][j] == 1 && !vis[i][j])
                {
                    en++;
                }
            }
        }
        return en;
    }
    static void dfs(int[][] grid, boolean[][] vis, int i, int j) {
    
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] || grid[i][j] != 1)
        {
            return;
        }

        vis[i][j] = true;

        
        for (int k = 0; k < 4; k++) {
            int nr = i + rowD[k];
            int nc = j + colD[k];
            dfs(grid, vis, nr, nc);
        }
    }
}