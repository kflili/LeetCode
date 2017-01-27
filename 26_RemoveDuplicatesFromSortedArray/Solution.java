public class Solution { 
    
    // Beat 14.98%
    public int removeDuplicates(int[] nums) { 
        if ( nums == null || nums.length == 0) return 0;
        int li = 0, hi = 1;
        while (hi < nums.length) {
            if (nums[li] != nums[hi]) {
                li++;
                nums[li] = nums[hi];
            } 
            hi++;
        }
        return li+1;   
    }
    
    // beats 81%
    public int removeDuplicates2(int[] nums) { 
        int i = nums.length > 0 ? 1 : 0; 
        for (int n : nums) 
            if (n > nums[i-1]) 
                nums[i++] = n; 
        return i; 
    }
    
}