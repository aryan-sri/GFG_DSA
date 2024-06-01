//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int x = 0, y = 0;
        
        for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            int position = character - 'a' + 1; 
            
            if (frequency % 2 == 0 && position % 2 == 0) {
                x++;
            } else if (frequency % 2 != 0 && position % 2 != 0) {
                y++;
            }
        }
        
     
        String ans = ((x + y) % 2 == 0) ? "EVEN" : "ODD";
        return ans;
    }
}