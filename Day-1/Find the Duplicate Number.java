class Solution {
    public int findDuplicate(int[] nums) {
        int s1=0, s2=0;
        int l=(nums.length)-1;
        s1=(l*(l+1))/2;
        for(int i=0;i<l+1;i++)
            s2=s2+nums[i];
        // System.out.println(s2+"-"+s1);
        return (s2-s1);
    }
}
