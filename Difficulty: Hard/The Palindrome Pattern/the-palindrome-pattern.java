//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String pattern(int[][] arr) {
      int n=arr.length;
      int m=arr[0].length;
      
     for(int i=0;i<n;i++)
      {
         boolean rowpalindrome=true;
         for(int j=0;j<=m/2;j++)
          {
            if(arr[i][j]!=arr[i][m-1-j])
            {
               rowpalindrome=false;
               break;
            }
          }
         if(rowpalindrome==true)
        {
            
           return i+" R";
        }
        }
        
      for(int i=0;i<n;i++)
      {
         boolean colpalindrome=true;
       for(int j=0;j<=m/2;j++)
          {
           if(arr[j][i]!=arr[m-1-j][i])
            {
                colpalindrome=false;
                break;
            }
             
            }
       
          if(colpalindrome==true)
         {
          return i+" C";
          
          }
      }
      return "-1";
    }
}

