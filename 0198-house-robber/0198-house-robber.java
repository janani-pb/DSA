class Solution {
    public int rob(int[] nums) {
        int t1=0;
        int t2=0;
        for(int num:nums){
            int t=Math.max(t1,num+t2);
            t2=t1;
            t1=t;
        }
        return t1;
    }
}