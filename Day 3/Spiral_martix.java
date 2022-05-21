class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        ArrayList<Integer> a=new ArrayList<>();
        int row=m.length;
        int col=m[0].length;
        int d=row;
        int x=row*col;
	    int c=-1,r=0;
        for(int i=1;i<=d;i++)
	    {
	        for(int j=1;j<=col;j++)
	        {
	            if(i%2!=0)
	            c++;
	            else
	            c--;
	            a.add(m[r][c]);
	        }
	        row--;
	        for(int k=1;k<=row;k++)
	        {
	            if(i%2!=0)
	            r++;
	            else
	            r--;
	            a.add(m[r][c]);
	        }
            col--;
            if(a.size()==x)
               break;
        }
        return a;
    }
}
