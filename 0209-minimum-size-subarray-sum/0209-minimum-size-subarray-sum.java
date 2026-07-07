class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int cur=0;
        int min = Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            cur+=nums[right];
            while(cur>=target){
                 min=Math.min(min,right-left+1);
                 cur-=nums[left];
                 left++;
            }
        }
        return min>nums.length?0:min;
    }
}