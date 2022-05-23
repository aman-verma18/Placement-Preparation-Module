// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            int Q = Integer.parseInt(read.readLine());
            
            int[] index = new int[Q];
            String[] sources = new String[Q];
            String[] targets = new String[Q];
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            String S3[] = read.readLine().split(" ");
            
            for(int i=0 ; i<Q ; i++) {
                index[i] = Integer.parseInt(S1[i]);
                sources[i] = S2[i];
                targets[i] = S3[i];
            }

            Solution ob = new Solution();
            System.out.println(ob.findAndReplace(S,Q,index,sources,targets));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        // code here
        int n=index.length;
        int lengthOfReplacedStrings=0;
        for(int i=0;i<n;i++){
            int ind=S.indexOf(sources[i],index[i]+lengthOfReplacedStrings);
            //System.out.println(ind+","+index[i]);
            if(ind==(index[i]+lengthOfReplacedStrings)){
                
                String s1=S.substring(0,ind);
                String s2=S.substring(ind,S.length());
                //System.out.println(s1+","+s2);
                s2=s2.replaceFirst(sources[i],targets[i]);
                S=s1+s2;
                
                lengthOfReplacedStrings+=(targets[i].length()-sources[i].length());
            }
            else continue;
            //System.out.println(S);
        }
        return S;
    }
};
