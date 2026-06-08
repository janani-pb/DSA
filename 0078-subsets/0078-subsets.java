class Solution {
    static void subset(int[] nums, int i, ArrayList<ArrayList<Integer>> l, ArrayList<Integer> a) {
        if (i == nums.length) {
            l.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        subset(nums, i + 1, l, a);
        a.remove(a.size() - 1);
        subset(nums, i + 1, l, a);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        subset(nums,0,l,a);
        return (List) l;
    }
}
