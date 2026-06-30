class Solution {
    public int numTrees(int n) {
        int[] d = new int [n+1];
        d[0]=1;
        d[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                d[i]+=d[j-1]*d[i-j];
            }
        }
        return d[n];
    }
}