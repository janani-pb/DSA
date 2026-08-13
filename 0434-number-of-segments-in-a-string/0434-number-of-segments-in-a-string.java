class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        String[] segments=s.split("\s+");
        return segments.length;
    }
}