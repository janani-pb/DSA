class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int rem = intervals.length;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i==j){
                    continue;
                }
                if(intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]){
                    rem--;
                    break;
                }
            }
        }
        return rem;
    }
}