//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    long long ExtractNumber(string sentence) {

        long long ans=-1;
        int i=0;
        
      while(i<sentence.size()){
         long long num=sentence[i]-'0';
         if(num>=0 && num<=9 && sentence[i]!=' '){
             long long num1=0;
             bool flag=true;
             
             while(sentence[i]-'0'>=0 && sentence[i]-'0'<=9 && sentence[i]!=' '){
                 num=sentence[i]-'0';
                 
                 if(num==9)
                 flag=false;
                 
                 num1=num1*10+num;
                 i++;
             }
             
             if(flag)
             ans=max(ans,num1);
         }
         else
         i++;
    }
    return ans;
        
    }


};

//{ Driver Code Starts.
int main() {

    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    string tc;
    getline(cin, tc);
    t = stoi(tc);
    while (t--) {
        string s;
        getline(cin, s);

        Solution ob;
        cout << ob.ExtractNumber(s) << "\n";
    }

    return 0;
}

// } Driver Code Ends