import java.util.*;
class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int area=0;
        
        while(l<r)
        {
            area = Math.max(area,Math.min(h[l], h[r]) * (r - l));
            if(h[l]<h[r])
                l++;
            else
                r--;
        }
        return area;
    }
}
