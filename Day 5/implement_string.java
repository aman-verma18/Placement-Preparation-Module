class Solution {
    public int strStr(String h, String n) {
        if(h==null || n==null)
            return -1;
        if(h.equals(n))
            return 0;
        if(h.length()<n.length())
            return -1;
        int num;
        int len=n.length();
        for(int i=0;i<h.length()-len+1;i++)
        {
            if(h.substring(i,i+len).equals(n))
                return i;
        }
        return -1;
    }
}
