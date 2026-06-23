class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0;
        int t1=0;
        for(char c:s.toCharArray()){
            s1+=c;
        }
        for(char a:t.toCharArray()){
            t1+=a;
        }
        return (char) (t1-s1);
    }
}