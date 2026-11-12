class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max=1,c1=1,c2=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                c1++;
                c2=1;
            }
            else if(nums[i]<nums[i-1]){
                c2++;
                c1=1;
            }
            else{
                c1=1;
                c2=1;
        
            }
            max=Math.max(max,Math.max(c1,c2));
        }
        return max;
    }
}