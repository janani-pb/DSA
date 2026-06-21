class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        Arrays.sort(costs);

        int c=0;
         for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                c++;
            } else {
                break;
            }
        }
        return c;
    }
}