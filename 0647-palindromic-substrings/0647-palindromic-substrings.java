class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int c = 0;
        
        for (int i = 0; i < s.length(); i++) {
            c += expandFromCenter(s, i, i);
            c += expandFromCenter(s, i, i + 1);
        }
        
        return c;
    }
    
    private int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}