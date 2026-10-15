class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 1;
        for (int i = 0; i < n; i++) {
            result[i] = l;
            l *= nums[i];
        }
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= r; 
            r *= nums[i];   
        }
        
        return result;
    }
}