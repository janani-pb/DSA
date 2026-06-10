class Solution {
    public void combine(int index,int t,int[] arr,List<List<Integer>> al,ArrayList<Integer> a){
        
            if(t==0){
                 al.add(new ArrayList<> (a));
                 return;}
        
            if(arr.length==index||t<0){
                return;
            }        
        if(arr[index]<=t){
            a.add(arr[index]);
            combine(index,t-arr[index],arr,al,a);
            a.remove(a.size()-1);
        }
          combine(index+1,t,arr,al,a);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al = new ArrayList<>();
        combine(0,target,candidates,al,new ArrayList<>());
        return al;
    }
}