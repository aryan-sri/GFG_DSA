//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.getCount(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] dirs = {{-1, 0}, {1,0}, {0,1}, {0,-1}, {0,0}};
    Long dp[][][] = new Long[4][3][26];
    StringBuilder sb = new StringBuilder();
    
    public long getCount(int n) {
        int[][] mat = new int[4][3];
       
        int k = 1;
        long ans = 0;
        
        // you can fill up the matrix to generate sequences
        
        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<3; j++)
        //     mat[i][j] = k++;
        // }
        
        mat[3][0] = -1;
        mat[3][2] = -1;
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
              //System.out.println(sb.append(mat[i][j]));
                ans += solve(i, j, n-1, mat);
                //sb.deleteCharAt(sb.length()-1);
            }
            
        }
        ans += solve(3,1,n-1,mat);
        return ans;
    }
    
    public long solve(int i, int j, int n, int[][] mat)
    {
        if(n == 0) 
        {
           // System.out.println(sb);
            return 1;
        }
        
        if(dp[i][j][n] != null)
        return dp[i][j][n];
        
        long ans = 0;
        
        for(int[] dir: dirs)
        {
            int nr = i+dir[0], nc = j+dir[1];
            if(nr>=0 && nr<4 && nc>=0 && nc<3 && mat[nr][nc] != -1)
            {
             //   sb.append(mat[nr][nc]);
                ans += solve(nr, nc, n-1, mat);
               // sb.deleteCharAt(sb.length()-1);
            }
            
        }
        return dp[i][j][n] = ans;
    }
}