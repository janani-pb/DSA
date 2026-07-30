class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        int costPerKey = 1;

        while (n > 0) {
            int currentBatch = Math.min(n, 8);
            pushes += currentBatch * costPerKey;
            n -= currentBatch;
            costPerKey++;
        }

        return pushes;
    }
}