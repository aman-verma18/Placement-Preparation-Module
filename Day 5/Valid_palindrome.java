class Solution {
    public boolean validPalindrome(String s) {
        String s1=s;
        StringBuffer bf1=new StringBuffer(s);
        StringBuffer bf2=new StringBuffer(s1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                
                bf1.replace(i, i+1, ""); 
                bf2.replace(s.length()-i-1,s.length()-i , ""); 
                break;
            }
        }
        s=bf1.toString();
        s1=bf2.toString();
        if(isPalindrome(s) || isPalindrome(s1))
            return true;
        else
            return false;
    }
    public static boolean isPalindrome(String str)
    {  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        String rev=sb.toString();  
        if(str.equals(rev))  
            return true;  
        else  
            return false;  
    }     
}
