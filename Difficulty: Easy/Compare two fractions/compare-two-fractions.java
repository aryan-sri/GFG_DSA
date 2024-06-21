//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        String nums[] = str.split(", ");
        String num1[] = nums[0].split("/");
        String num2[] = nums[1].split("/");
        float n1 = ((float)Integer.parseInt(num1[0])/Integer.parseInt(num1[1]));
        float n2 = ((float)Integer.parseInt(num2[0])/Integer.parseInt(num2[1]));
        
        if (n1 == n2){
            return "equal";
        } else {
            return (n1 > n2) ? nums[0] : nums[1];
        }
    }
}