class Solution {
    public void permute(int[] nums, int start,List<List<Integer>> al){
        if(start==nums.length){
              ArrayList<Integer> a = new ArrayList<>();
              for(int n:nums){
                a.add(n);
              }
              al.add(a);
              return;
        }
        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            permute(nums,start+1,al);
            swap(nums,start,i);
        }
    }
    public void swap(int[] nums,int a, int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        permute(nums,0,al);
        return al;

    }
}