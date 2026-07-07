class Solution {
    public long sumAndMultiply(int n) {
        if (n==0){
            return 0;
        }
        long x =0;
        long s=0;
        long m=1;
        while(n>0){
            int d=n%10;
            if(d!=0){
                s+=d;
                x=d*m+x;
                m*=10;
            }
            n/=10;
        }
        return x*s;
    }
}