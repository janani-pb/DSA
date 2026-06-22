class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int maxWords = counts['b' - 'a'];
        maxWords = Math.min(maxWords, counts['a' - 'a']);
        maxWords = Math.min(maxWords, counts['l' - 'a'] / 2); 
        maxWords = Math.min(maxWords, counts['o' - 'a'] / 2); 
        maxWords = Math.min(maxWords, counts['n' - 'a']);
        
        return maxWords;
    }
}
