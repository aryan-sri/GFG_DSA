//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findClosest(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int s=0, e=n-1;
        if(k<=arr[s])return arr[s];
         else if(k>=arr[e])return arr[e];
         
         while(s<=e){
             int m=s+(e-s)/2;
             if(arr[m]==k)return arr[m];
             
             else if(arr[m]>k){
                 e=m-1;
                 
             }
             else{
                 s=m+1;
             }
             
             
         }
         return( Math.abs(arr[e]-k)<Math.abs(arr[s]-k))?arr[e]:arr[s];
         
    }
}