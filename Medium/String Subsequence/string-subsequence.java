//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s1;
            s1 = br.readLine();

            String s2;
            s2 = br.readLine();

            Solution obj = new Solution();
            int res = obj.countWays(s1, s2);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    static int f(int x, int y,String s1, String s2,int dp[][] ) {
		if(y>=s2.length())	return 1; 
		if(x>=s1.length()) return 0;
		
		if(dp[x][y]!=-1)return dp[x][y];
		
					
		if(s1.charAt(x)==s2.charAt(y)) {
			return dp[x][y]=(f(x+1,y,s1,s2,dp)+f(x+1,y+1,s1,s2,dp))%1000000007;
		}else {
			return dp[x][y]=f(x+1,y,s1,s2,dp)%1000000007;
		}
	}
    
    
    public static int countWays(String s1, String s2) {
       	int dp[][]=new int[s1.length()+1][s2.length()+1];
		for(int a[]:dp) 
			Arrays.fill(a, -1);
		
		return f(0,0,s1, s2,dp);
    }
}
