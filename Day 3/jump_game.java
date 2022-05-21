class Solution {
    public boolean canJump(int[] nums) {
        int currMax=0;
        for(int i=0;i<nums.length-1;i++){
            currMax=Math.max(currMax, i+nums[i]);
            if(i==currMax && nums[i]==0){
                return false;
            }
        }
        return true;
    }
}
