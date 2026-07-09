class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int [] a = new int[n];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                a[i]=a[i-1];
            }
            else{
                a[i]=a[i-1]+1;
            }
        }
        boolean[] r=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            r[i]=(a[u]==a[v]);
        }
        return r;
    }
}

            
         