class Solution {
    public void setZeroes(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(m[i][j]==0)
                {
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(set1.contains(i)  || set2.contains(j))
                    m[i][j]=0;
            }
        }
    }
}
